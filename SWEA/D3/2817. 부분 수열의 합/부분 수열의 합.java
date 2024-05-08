import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	static int[] arr;
    static int N, K, ans;

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            N = sc.nextInt();
            K = sc.nextInt();

            arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            ans = 0;
            dfs(0, 0);
            System.out.println("#" + test_case + " " + ans);
        }
    }

    static void dfs(int depth, int sum){
        if(sum == K) {
            ans++;
            return;
        }
        if(sum > K || depth == N) return;

        dfs(depth + 1, sum + arr[depth]);
        dfs(depth + 1, sum);
    }
}