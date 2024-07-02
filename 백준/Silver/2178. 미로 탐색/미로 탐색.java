import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] arr;
    static boolean[][] visited;
    static int N, M;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            String str = sc.next();
            for(int j=0; j<M; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        visited[0][0] = true;
        bfs(0, 0);
        System.out.println(arr[N-1][M-1]);
    }

    public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});

        while(!q.isEmpty()){
            int now[] = q.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i=0; i<4; i++){
                int cx = nowX + dx[i];
                int cy = nowY + dy[i];

                if(cx>=0 && cx<N && cy>=0 && cy<M){
                    if(!visited[cx][cy] && arr[cx][cy] == 1){
                        q.offer(new int[] {cx, cy});
                        visited[cx][cy] = true;
                        arr[cx][cy] = arr[nowX][nowY] + 1;
                    }
                }
            }
        }
    }
}