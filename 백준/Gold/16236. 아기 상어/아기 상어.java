import java.util.*;

public class Main {
    static final int[] dy = {-1, 0, 0, 1};
    static final int[] dx = {0, -1, 1, 0};
    static int[][] map;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        int[] shark = new int[2];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 9) {
                    shark[0] = i;
                    shark[1] = j;
                    map[i][j] = 0;
                }
            }
        }

        int size = 2, eat = 0, totalMove = 0;

        while (true) {
            int[] next = bfs(shark, size);
            if (next == null) break;

            shark[0] = next[0];
            shark[1] = next[1];
            totalMove += next[2];
            map[shark[0]][shark[1]] = 0;

            if (++eat == size) {
                size++;
                eat = 0;
            }
        }

        System.out.println(totalMove);
    }

    static int[] bfs(int[] start, int size) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt((int[] a) -> a[2])
                .thenComparing(a -> a[0]).thenComparing(a -> a[1]));
        boolean[][] visited = new boolean[N][N];

        pq.add(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            if (map[cur[0]][cur[1]] > 0 && map[cur[0]][cur[1]] < size) {
                return cur;
            }
            
            for (int k = 0; k < 4; k++) {
                int ny = cur[0] + dy[k];
                int nx = cur[1] + dx[k];
                if (ny >= 0 && nx >= 0 && ny < N && nx < N && !visited[ny][nx] && map[ny][nx] <= size) {
                    pq.add(new int[]{ny, nx, cur[2] + 1});
                    visited[ny][nx] = true;
                }
            }
        }
        return null;
    }
}