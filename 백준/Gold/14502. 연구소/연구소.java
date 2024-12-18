import java.util.*;

public class Main {
    static int N, M;
    static int[][] arr;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N][M];
        List<int[]> zeros = new ArrayList<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = sc.nextInt();

                if (arr[i][j] == 0) {
                    zeros.add(new int[]{i, j});
                }
            }
        }

        for (int x = 0; x < zeros.size(); x++) {
            for (int y = x + 1; y < zeros.size(); y++) {
                for (int z = y + 1; z < zeros.size(); z++) {
                    int[] pos1 = zeros.get(x);
                    int[] pos2 = zeros.get(y);
                    int[] pos3 = zeros.get(z);

                    arr[pos1[0]][pos1[1]] = 1;
                    arr[pos2[0]][pos2[1]] = 1;
                    arr[pos3[0]][pos3[1]] = 1;

                    bfs();

                    arr[pos1[0]][pos1[1]] = 0;
                    arr[pos2[0]][pos2[1]] = 0;
                    arr[pos3[0]][pos3[1]] = 0;
                }
            }
        }

        System.out.println(max);
    }

    public static void bfs(){
        Queue<int[]> q = new LinkedList<>();

        int[][] tmp = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                tmp[i][j] = arr[i][j];
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(tmp[i][j] == 2) q.offer(new int[] {i, j});
            }
        }

        while(!q.isEmpty()){
            int[] poll = q.poll();
            int x = poll[0];
            int y = poll[1];

            for(int i=0; i<4; i++){
                int cx = x + dx[i];
                int cy = y + dy[i];

                if(cx>=0 && cx<N && cy>=0 && cy<M){
                    if(tmp[cx][cy] == 0){
                        tmp[cx][cy] = 2;
                        q.offer(new int[] {cx, cy});
                    }
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tmp[i][j] == 0) {
                    cnt++;
                }
            }
        }
        max = Math.max(max, cnt);
    }
}