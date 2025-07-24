class Solution {
    static String[] alph = {"zero", "one", "two", "three", "four",
                           "five", "six", "seven", "eight", "nine"};
    
    public int solution(String s) {        
        String tmp = "";
        String ans = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(Character.isDigit(c)){
                ans += c;
            }else{
                tmp += c;
                for(int j=0; j<alph.length; j++){
                    if(tmp.equals(alph[j])){
                        ans += j;
                        tmp = "";
                        break;
                    }
                }
            }
        }
        return Integer.parseInt(ans);
    }
}