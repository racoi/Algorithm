import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int []dx = {-1,1,0,0,0,0};
    static int []dy = {0,0,-1,1,0,0};
    static int []dz = {0,0,0,0,1,-1};

    static int M;
    static int N;
    static int H;
    static int[][][] arr;
    static Queue<Dot> q = new LinkedList<>();
    
    public static class Dot {
        int x;
        int y;
        int z;
        public Dot(int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        N = sc.nextInt();
        H = sc.nextInt();
        arr = new int[H][N][M];

        for(int z=0; z<H; z++){
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    arr[z][i][j] = sc.nextInt();
                    
                    if(arr[z][i][j] == 1){
                        q.offer(new Dot(i,j,z));
                    }
                }
            }
        }

        System.out.println(bfs());
    }

    public static int bfs(){
        while(!q.isEmpty()){
            Dot d = q.poll();
            int x = d.x;
            int y = d.y;
            int z = d.z;
            
            for(int i=0; i<6; i++){
                int cx = x + dx[i];
                int cy = y + dy[i];
                int cz = z + dz[i];
                if(cx>=0 && cx<N && cy>=0 && cy<M && cz>=0 && cz<H){
                    if(arr[cz][cx][cy] == 0){
                        arr[cz][cx][cy] = arr[z][x][y] + 1;
                        q.offer(new Dot(cx, cy, cz));
                    }
                }
            }
        }
        int max = 0;
        for(int z=0; z<H; z++){
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(arr[z][i][j] == 0) return -1;
                    max = Math.max(max, arr[z][i][j]);
                }
            }
        }
        
        if(max == 1) return 0;
        else return max - 1;
    }
}