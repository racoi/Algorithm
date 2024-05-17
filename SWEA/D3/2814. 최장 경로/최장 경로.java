import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int N, M, max;
    static int[][] arr;
    static boolean[] visited;

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            max = 0;

            N = sc.nextInt();
            M = sc.nextInt();

            arr = new int[N+1][N+1];
            visited = new boolean[N+1];

            for(int i = 0; i < M; i++){
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                arr[num1][num2] = 1;
                arr[num2][num1] = 1;
            }

            for(int start = 1; start <= N; start++){
                visited[start] = true;
                dfs(start, 1);
                visited[start] = false;
            }

            System.out.println("#" + test_case + " " + max);
        }
    }

    static void dfs(int idx, int cnt){
        if(cnt > max) max = cnt;
        for(int i = 1; i <= N; i++){
            if(visited[i]) continue;
            if(arr[idx][i] == 1){
                visited[i] = true;
                dfs(i, cnt+1);
                visited[i] = false;
            }
        }
    }
}