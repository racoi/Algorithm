import java.util.*;

public class Main {
    static int N;
    static int[][] arr;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> q = new LinkedList<>();
    static int max = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][N];
        int max_height = 0;
        for (int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
                max_height = Math.max(max_height, arr[i][j]);
            }
        }
        for(int h = 1; h <= max_height; h++) {
            boolean[][] visited = new boolean[N][N];
            int cnt = 0;

            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(arr[i][j] - h > 0 && !visited[i][j]){
                        visited[i][j] = true;
                        q.offer(new int[]{i, j});
                        bfs(h, visited);
                        cnt++;
                    }
                }
            }
            max = Math.max(cnt, max);
        }
        System.out.println(max);
    }

    public static void bfs(int h, boolean[][] visited){
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for(int i=0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx>=0 && nx<N && ny>=0 && ny<N){
                    if(arr[nx][ny]-h > 0 && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        q.offer(new int[] {nx, ny});
                    }
                }
            }
        }
    }
}