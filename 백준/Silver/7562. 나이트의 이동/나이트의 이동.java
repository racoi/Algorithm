import java.util.*;

public class Main {
    static int I;
    static int[][] arr;
    static int[] dx = {-2, -1, 1, 2, -2, -1, 1, 2};
    static int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
    static boolean[][] visited;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=0; tc<T; tc++){
            I = sc.nextInt();
            arr = new int[I][I];
            visited = new boolean[I][I];
            bfs(sc.nextInt(), sc.nextInt());
            System.out.println(arr[sc.nextInt()][sc.nextInt()]);
        }

    }

    public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()){
            int[] poll = q.poll();
            int nx = poll[0];
            int ny = poll[1];

            for(int i=0; i<8; i++){
                int cx = nx + dx[i];
                int cy = ny + dy[i];

                if(cx>=0 && cx<I && cy>=0 && cy<I){
                    if(!visited[cx][cy]){
                        arr[cx][cy] = arr[nx][ny] + 1;
                        visited[cx][cy] = true;
                        q.offer(new int[]{cx, cy});
                    }
                }
            }
        }
    }
}