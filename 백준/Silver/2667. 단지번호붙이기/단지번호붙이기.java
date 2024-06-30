import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class Main{
    static int N, num;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        N = sc.nextInt();
        arr = new int[N][N];
        visited = new boolean[N][N];

        for(int i=0; i<N; i++){
            String str = sc.next();
            for(int j=0; j<N; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j] == 1 && !visited[i][j]){
                    dfs(i, j);
                    list.add(num);
                    num = 0;
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public static void dfs(int x, int y){
        visited[x][y] = true;
        num++;

        for(int i=0; i<4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx>=0 && cx<N && cy>=0 && cy<N){
                if(arr[cx][cy] == 1 && !visited[cx][cy]){
                    dfs(cx, cy);
                }
            }
        }
    }
}