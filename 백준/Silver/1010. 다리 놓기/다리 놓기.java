import java.util.*;

public class Main {
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dp = new int[30][30];

        int T = sc.nextInt();
        for(int tc=0; tc<T; tc++){
            int N = sc.nextInt();
            int M = sc.nextInt();

            System.out.println(factorial(M, N));
        }
    }
    static int factorial(int a, int b){
        if (dp[a][b] > 0) return dp[a][b];
        if(a == b || b == 0) return dp[a][b] = 1;
        return dp[a][b] = factorial(a-1, b-1) + factorial(a-1, b);
    }
}