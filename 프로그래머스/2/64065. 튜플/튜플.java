import java.util.*;

class Solution {
    public int[] solution(String s) {        
        s = s.substring(2, s.length() - 2);
        String[] sets = s.split("\\},\\{");

        Arrays.sort(sets, Comparator.comparingInt(String::length));

        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (String set : sets) {
            String[] numbers = set.split(",");
            for (String numStr : numbers) {
                int num = Integer.parseInt(numStr);
                if (!seen.contains(num)) {
                    result.add(num);
                    seen.add(num);
                }
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}