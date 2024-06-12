import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        
        int N = sc.nextInt();
        
        for(int i=0; i<N; i++){
            String str = sc.next();
            
            switch(str){
                case "push":
                    int num = sc.nextInt();
                    stack.push(num);
                    break;
                case "pop":
                    if(!stack.isEmpty()){
                        sb.append(stack.pop()).append('\n');
                    } else{
                        sb.append(-1).append('\n');
                    }
                    break;
                case "size":
                    sb.append(stack.size()).append('\n');
                    break;
                case "empty":
                    if(stack.isEmpty()){
                        sb.append(1).append('\n');
                    } else{
                        sb.append(0).append('\n');
                    }
                    break;
                case "top":
                    if(!stack.isEmpty()){
                        sb.append(stack.peek()).append('\n');
                    } else{
                        sb.append(-1).append('\n');
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}