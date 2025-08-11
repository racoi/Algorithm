class Solution {
    public String solution(String new_id) {
        if(new_id.length() == 0) return "aaa";
        
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        String tmp = "";
        boolean flag = false;
        for(int i=0; i<new_id.length(); i++){
            char c = new_id.charAt(i);
            if(c == '.'){
                if(!flag){
                    tmp += c;
                    flag = true;
                }
            }else{
                tmp += c;
                flag = false;
            }
        }
        new_id = tmp;
        
        if(new_id.length()>0 && new_id.charAt(0)=='.') new_id = new_id.substring(1);
        if(new_id.length()>0 && new_id.charAt(new_id.length()-1)=='.') new_id = new_id.substring(0, new_id.length()-1);
        
        
        if(new_id.length() == 0) return "aaa";
        else if(new_id.length() > 15){
            new_id = new_id.substring(0, 15);
        }
        
        if (new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }
        return new_id;
    }
}