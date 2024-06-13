import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            Stack<Character> stack = new Stack<>();
            boolean flag = true;

            String str = sc.next();
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);

                if(ch == '('){
                    stack.push(ch);
                } else if(stack.empty()){
                    flag = false;
                    break;
                } else{
                    stack.pop();
                }
            }
            if(!stack.empty()){
                flag = false;
            }

            if(flag){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}