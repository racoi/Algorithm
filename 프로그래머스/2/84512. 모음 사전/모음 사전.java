import java.util.List;
import java.util.ArrayList;

class Solution {
    static List<String> list = new ArrayList<>();
    static String[] alpha = {"A", "E", "I", "O", "U"};
    static int answer;
    
    public int solution(String word) {
        int answer = 0;
        
        dfs("");
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(word)){
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    static void dfs(String str){
        list.add(str);
        
        if(str.length() == 5) return;
        
        for(int i=0; i<5; i++){
            dfs(str + alpha[i]);
        }
    }
}