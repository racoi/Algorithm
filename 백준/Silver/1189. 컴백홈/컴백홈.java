import java.io.*;
import java.util.*;

public class Main {
    static int R, C, K, ans = 0;
    static char[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new char[R][C];
        visited = new boolean[R][C];
        visited[R-1][0] = true;

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        dfs(R-1, 0, 1);
        System.out.println(ans);

    }

    static void dfs(int x, int y, int k) {
        if (x == 0 && y == C - 1) {
            if (k == K) {
                ans++;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                if (!visited[nx][ny] && arr[nx][ny] != 'T') {
                    visited[nx][ny] = true;
                    dfs(nx, ny, k + 1);
                    visited[nx][ny] = false;
                }
            }
        }
    }
}