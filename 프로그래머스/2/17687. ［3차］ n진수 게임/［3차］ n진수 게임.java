import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        List<String> list = new ArrayList<>();
        for(int i=0; i<t*m; i++){
            String str = Integer.toString(i, n);

            String[] ch = str.split("");
            for(String j : ch) list.add(j);
        }
        for(int i=p-1; i<t*m; i+=m){
            answer += Character.toUpperCase(list.get(i).charAt(0));
        }
        return answer;
    }
}