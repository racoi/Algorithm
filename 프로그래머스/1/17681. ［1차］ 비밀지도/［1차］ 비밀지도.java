import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            String tmp1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i]))
                            .replace(' ', '0');
            String tmp2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i]))
                            .replace(' ', '0');
            
            String str = "";
            for(int j=0; j<n; j++){
                if(tmp1.charAt(j) == '0' && tmp2.charAt(j) == '0'){
                    str += " ";
                }else{
                    str += "#";
                }
            }
            answer[i] = str;
        }
        return answer;
    }
}