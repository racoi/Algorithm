import java.io.*;
import java.util.*;

public class Main {
    static int N, S;
    static int[] arr;
    static boolean[] visited;
    static int ans;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        visited = new boolean[N + 1];
        ans = 1;

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        S = Integer.parseInt(br.readLine());

        visited[S] = true;
        dfs(S);

        System.out.println(ans);
    }

    static void dfs(int start) {
        int front = start - arr[start];
        if(front > 0 && !visited[front]) {
            visited[front] = true;
            ans++;
            dfs(front);
        }
        
        int back = start + arr[start];
        if(back <= N && !visited[back]) {
            visited[back] = true;
            ans++;
            dfs(back);
        }
    }
}