import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        
        int sum = 0;
        int cnt = 1;
        
        while(true){
            if(X <= sum + cnt){
                if(cnt % 2 == 1){
                    System.out.println((cnt + 1 - (X - sum)) + "/" + (X - sum));
                    break;
                } else{
                    System.out.println((X - sum) + "/" + (cnt + 1 - (X - sum)));
                    break;
                }
            } else{
                sum += cnt;
                cnt++;
            }
        }
    }
}