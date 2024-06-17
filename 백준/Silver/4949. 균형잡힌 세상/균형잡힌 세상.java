import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            String str = sc.nextLine();

            if(str.equals(".")) break;

            System.out.println(solve(str));
        }
    }

    public static String solve(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '['){
                stack.push(ch);
            }
            else if(ch == ')'){
                if(stack.empty() || stack.peek() != '('){
                    return "no";
                } else{
                    stack.pop();
                }
            }
            else if(ch == ']'){
                if(stack.empty() || stack.peek() != '['){
                    return "no";
                } else{
                    stack.pop();
                }
            }
        }
        
        if(stack.empty()){
            return "yes";
        }else{
            return "no";
        }
    }
}