import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int w, h, count;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = new int[] {-1, 1, 0, 0, 1, 1, -1, -1};
    static int[] dy = new int[] {0, 0, -1, 1, 1, -1, 1, -1};
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0 && h==0){
                return;
            }

            arr = new int[h][w];
            visited = new boolean[h][w];

            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            count = 0;
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(!visited[i][j] && arr[i][j]==1){
                        q.offer(new int[] {i, j});
                        visited[i][j] = true;
                        bfs();
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void bfs(){
        while(!q.isEmpty()){
            int[] n = q.poll();
            int x = n[0];
            int y = n[1];
            for(int i=0; i<8; i++){
                int cx = x + dx[i];
                int cy = y + dy[i];

                if(cx>=0 && cx<h && cy>=0 && cy<w){
                    if(!visited[cx][cy] && arr[cx][cy]==1){
                        q.offer(new int[] {cx, cy});
                        visited[cx][cy] = true;
                    }
                }
            }
        }
    }
}