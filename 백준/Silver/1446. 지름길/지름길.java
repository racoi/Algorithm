import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        int[] dp = new int[D + 1];

        int[][] arr = new int[N][3];
        for(int i = 0; i < N; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        dp[0] = 0;
        for (int i = 1; i <= D; i++) {
            dp[i] = dp[i - 1] + 1;

            for(int j = 0; j < N; j++){
                if(arr[j][1] == i){
                    dp[i] = Math.min(dp[i], dp[arr[j][0]] + arr[j][2]);
                }
            }
        }

        System.out.println(dp[D]);
    }
}