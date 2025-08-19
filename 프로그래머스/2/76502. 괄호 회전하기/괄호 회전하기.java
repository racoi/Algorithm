import java.util.Stack;

class Solution {
    public int solution(String s) {
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            if(isValid(s)) ans++;
            
            s = s.substring(1) + s.charAt(0);
        }
        return ans;
    }
    
    static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '[' || c == '{' || c == '(') stack.push(c);
            else{
                if(stack.isEmpty()) return false;
                char pop = stack.pop();
                if(c == ']' && pop != '[') return false;
                if(c == '}' && pop != '{') return false;
                if(c == ')' && pop != '(') return false;
            }
        }
        return stack.isEmpty();
    }
}