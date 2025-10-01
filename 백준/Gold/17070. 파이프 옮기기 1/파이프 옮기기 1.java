import java.util.*;
 
public class Main {
    static int N;
    static int[][] map;
    static int ans;
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
 
        ans = 0;
        dfs(1, 2, 0);
        
        System.out.println(ans);
    }

    public static void dfs(int x, int y, int dir) {
        if (x == N && y == N) {
            ans++;
            return;
        }
 
        if(dir == 0){
            if (y + 1 <= N && map[x][y + 1] == 0) dfs(x, y + 1, 0);
        }else if(dir == 1){
            if (x + 1 <= N && map[x + 1][y] == 0) dfs(x + 1, y, 1);
        }else{
            if (y + 1 <= N && map[x][y + 1] == 0) dfs(x, y + 1, 0);
            if (x + 1 <= N && map[x + 1][y] == 0) dfs(x + 1, y, 1);
        }
        
        if (y + 1 <= N && x + 1 <= N && map[x][y + 1] == 0 && map[x + 1][y] == 0 && map[x + 1][y + 1] == 0) {
            dfs(x + 1, y + 1, 2);
        }
    }
 
}