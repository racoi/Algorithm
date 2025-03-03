import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[1001];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 0;
        dp[4] = 1;
        for(int i=5; i<n+1; i++){
            if(dp[i-1]==1 && dp[i-3]==1 && dp[i-4]==1) dp[i] = 0;
            else dp[i] = 1;
        }

        if(dp[n] == 1) System.out.println("SK");
        else System.out.println("CY");
    }
}