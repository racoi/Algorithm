import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        
        int K = sc.nextInt();

        for(int i=0; i<K; i++){
            
            int N = sc.nextInt();
            
            if(N == 0){
                stack.pop();
            } else{
                stack.push(N);
            }
        }
        
        int sum = 0;
        
        while(!stack.empty()){
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}