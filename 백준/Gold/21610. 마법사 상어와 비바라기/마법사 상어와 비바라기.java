import java.util.Scanner;

public class Main {
    static int[] dx = {0, -1, -1, -1, 0, 1, 1, 1};
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int N;
    static int[][] water;
    static boolean[][] cloud;
    static boolean[][] tmpCloud;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        water = new int[N][N];
        cloud = new boolean[N][N];
        tmpCloud = new boolean[N][N];
        cloud[N-1][0] = true;
        cloud[N-1][1] = true;
        cloud[N-2][0] = true;
        cloud[N-2][1] = true;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                water[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            int d = sc.nextInt();
            int s = sc.nextInt();

            moveCloud(d, s);
            copyWater();
            makeCloud();
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                cnt += water[i][j];
            }
        }
        System.out.println(cnt);
    }

    static void moveCloud(int d, int s) {
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(cloud[i][j]){
                    int nx = (i + (dx[d-1] + N) * s) % N;
                    int ny = (j + (dy[d-1] + N) * s) % N;

                    cloud[i][j] = false;
                    tmpCloud[nx][ny] = true;
                    water[nx][ny]++;
                }
            }
        }
    }

    static void copyWater(){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(tmpCloud[i][j]){
                    for(int k=1; k<8; k+=2){
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if(nx >= 0 && nx < N && ny >= 0 && ny < N){
                            if(water[nx][ny] > 0) water[i][j]++;
                        }
                    }
                }
            }
        }
    }

    static void makeCloud(){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!tmpCloud[i][j] && water[i][j] >= 2){
                    water[i][j] -= 2;
                    cloud[i][j] = true;
                }
                else if(tmpCloud[i][j]) tmpCloud[i][j] = false;
            }
        }
    }
}