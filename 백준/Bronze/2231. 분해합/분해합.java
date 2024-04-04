import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int result = 0;
        
        for(int i=0; i<N; i++){
            int sum = 0;
            int num = i;
            
            while(num != 0){
                sum += num % 10;
                num /= 10;
            }
            
            if(sum + i == N){
                result = i;
                break;
            }
        }
        
        System.out.println(result);
    }
}