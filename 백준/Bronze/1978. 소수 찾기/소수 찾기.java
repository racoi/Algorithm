import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int cnt = N;
        for(int i=0; i<N; i++){
            int n = sc.nextInt();
            if(n == 1){
                cnt--;
                continue;
            }
            for(int j=2; j<n; j++){
                if(n % j == 0){
                    cnt--;
                    break;
                }
            }
        }
        
        System.out.println(cnt);
    }
}