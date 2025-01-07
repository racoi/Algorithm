import java.util.*;

public class Main {
    static int M, N;
    static int[][] arr;
    static int[] dx = {0, 0, -1, 1, 1, -1, 1, -1};
    static int[] dy = {-1, 1, 0, 0, 1, 1, -1, -1};
    static boolean[][] visited;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j] == 0){
                    max = Math.max(max, bfs(i, j));
                }
            }
        }
        System.out.println(max);
    }

    public static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y, 0});
        visited = new boolean[N][M];
        visited[x][y] = true;

        while (!q.isEmpty()){
            int[] poll = q.poll();
            int nx = poll[0];
            int ny = poll[1];
            int dist = poll[2];

            for(int i=0; i<8; i++){
                int cx = nx + dx[i];
                int cy = ny + dy[i];

                if(cx>=0 && cx<N && cy>=0 && cy<M){
                    if(!visited[cx][cy]){
                        if(arr[cx][cy] == 1) return dist + 1;
                        q.offer(new int[]{cx, cy, dist + 1});
                        visited[cx][cy] = true;
                    }
                }
            }
        }
        return 0;
    }
}