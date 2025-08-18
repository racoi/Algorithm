import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> set = new HashSet<>();
        
        int num = 1;
        int cnt = 1;
        set.add(words[0]);
        char ch = words[0].charAt(words[0].length()-1);
        for(int i=1; i<words.length; i++){
            num++;
            if(num > n){
                num = 1;
                cnt++;
            }
            if(set.contains(words[i]) || ch != words[i].charAt(0)){
                return new int[]{num, cnt};
            }
            set.add(words[i]);
            ch = words[i].charAt(words[i].length()-1);
        }

        return new int[]{0, 0};
    }
}