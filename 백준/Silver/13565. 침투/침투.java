import java.io.*;

public class Main {
    static int N, M;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static boolean check = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        N = Integer.parseInt(nm[0]);
        M = Integer.parseInt(nm[1]);

        arr = new int[N][M];
        visited = new boolean[N][M];

        for (int i=0; i<N; i++) {
            String str = br.readLine();
            for (int j=0; j<M; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i=0; i<M; i++) {
            if (arr[0][i] == 0) {
                dfs(0, i);
            }
        }

        System.out.println(check ? "YES" : "NO");

    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        if (x==N-1 && arr[x][y]==0) {
            check = true;
            return;
        }

        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx>=0 && ny>=0 && nx<N && ny<M) {
                if(!visited[nx][ny] && arr[nx][ny]==0) {
                    dfs(nx, ny);
                }
            }
        }
    }
}