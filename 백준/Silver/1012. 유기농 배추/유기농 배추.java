import java.util.Scanner;

public class Main{

    static boolean[][] arr;
    static boolean[][] visited;
    static int M, N;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int count;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int tc=0; tc<T; tc++){
            count = 0;
            M = sc.nextInt();
            N = sc.nextInt();
            int K = sc.nextInt();

            arr = new boolean[N][M];
            visited = new boolean[N][M];

            for(int i=0; i<K; i++){
                int X = sc.nextInt();
                int Y = sc.nextInt();
                arr[Y][X] = true;
            }

            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(!visited[i][j] && arr[i][j]){
                        dfs(j, i);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void dfs(int x, int y){
        visited[y][x] = true;

        for(int i=0; i<4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx>=0 && cy>=0 && cx<M && cy<N){
                if(!visited[cy][cx] && arr[cy][cx]){
                    dfs(cx, cy);
                }
            }
        }
    }
}