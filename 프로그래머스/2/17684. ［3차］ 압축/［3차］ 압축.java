import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String msg) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=1; i<=26; i++){
            map.put(Character.toString((char)('A' + i-1)), i);
        }
        
        int idx = 27;
        int pos = 0;
        while(pos < msg.length()){
            String w = "";
            int lastIdx = 0;
            
            for(int i=pos; i<msg.length(); i++){
                String tmp = msg.substring(pos, i+1);
                if(map.containsKey(tmp)){
                    w = tmp;
                    lastIdx = map.get(tmp);
                }else{
                    map.put(tmp, idx++);
                    break;
                }
            }    
            answer.add(lastIdx);
            pos += w.length();
        }
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}