import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> log = new ArrayList<>();;
        HashMap<String, String> nameMap = new HashMap<>();
        
        for(int i=0; i<record.length; i++){
            String[] str = record[i].split(" ");
            if(str.length == 3){
                nameMap.put(str[1], str[2]);
            }
        }
        
        for(int i=0; i<record.length; i++){
            String[] str = record[i].split(" ");
            String status = str[0];
            String uid = str[1];
            
            if(str[0].equals("Enter")){
                log.add(nameMap.get(str[1]) + "님이 들어왔습니다.");
            }
            else if(str[0].equals("Leave")){
                log.add(nameMap.get(str[1]) + "님이 나갔습니다.");
            }
        }
        
        return log.toArray(new String[0]);
    }
}