import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int max = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j< M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[N][M];
        int cnt = 0;

        for(int i=0; i<N; i++) {
            for(int j = 0; j< M; j++) {
                if(arr[i][j] == 1 && !visited[i][j]) {
                    bfs(j, i);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        System.out.println(max);
    }

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, y});
        visited[y][x] = true;
        int size = 1;

        while(!q.isEmpty()) {
            int[] p = q.poll();
            int px = p[0];
            int py = p[1];

            for(int i=0; i<4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if(nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if(arr[ny][nx] == 1 && !visited[ny][nx]) {
                        visited[ny][nx] = true;
                        q.add(new int[] {nx, ny});
                        size++;
                    }
                }
            }
        }
        max = Math.max(max, size);
    }
}