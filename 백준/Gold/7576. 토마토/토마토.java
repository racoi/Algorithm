import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int M, N;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] arr;
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        N = sc.nextInt();
        arr = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j] == 1){
                    q.offer(new int[] {i, j});
                }
            }
        }

        System.out.println(bfs());
    }

    public static int bfs(){
        while(!q.isEmpty()){
            int[] n = q.poll();
            int x = n[0];
            int y = n[1];
            for(int i=0; i<4; i++){
                int cx = x + dx[i];
                int cy = y + dy[i];
                if(cx>=0 && cx<N && cy>=0 && cy<M){
                    if(arr[cx][cy] == 0){
                        arr[cx][cy] = arr[x][y] + 1;
                        q.offer(new int[] {cx, cy});
                    }
                }
            }
        }
        int max = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j] == 0) return -1;

                max = Math.max(max, arr[i][j]);
            }
        }
        return max - 1;
    }
}