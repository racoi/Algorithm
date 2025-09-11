import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        for(int len=1; len<=elements.length; len++){
            for(int start=0; start<elements.length; start++){
                int sum = 0;
                for(int i=0; i<len; i++){
                    sum += elements[(start + i) % elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}