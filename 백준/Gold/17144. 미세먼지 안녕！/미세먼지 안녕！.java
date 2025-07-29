import java.util.*;

public class Main {
    static int R, C;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int air1, air2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        int T = sc.nextInt();
        map = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < R; i++){
            if(map[i][0] == -1){
                air1 = i;
                air2 = i + 1;
                break;
            }
        }

        for(int i = 0; i < T; i++){
            map = dust();
            airCond();
        }

        int res = 0;
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                if(map[i][j] == -1) continue;
                res += map[i][j];
            }
        }
        System.out.println(res);
    }

    public static int[][] dust() {
        int[][] tmp = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == -1) {
                    tmp[i][j] = -1;
                    continue;
                }
                tmp[i][j] += map[i][j];

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx < 0 || nx >= R || ny < 0 || ny >= C) continue;
                    if (map[nx][ny] == -1) continue;

                    tmp[nx][ny] += (map[i][j] / 5);
                    tmp[i][j] -= (map[i][j] / 5);
                }
            }
        }
        return tmp;
    }

    public static void airCond() {
        int up = air1;
        for (int x = up - 1; x > 0; x--) map[x][0] = map[x - 1][0];
        for (int y = 0; y < C - 1; y++) map[0][y] = map[0][y + 1];
        for (int x = 0; x < up; x++) map[x][C - 1] = map[x + 1][C - 1];
        for (int y = C - 1; y > 1; y--) map[up][y] = map[up][y - 1];
        map[up][1] = 0;

        int down = air2;
        for (int x = down + 1; x < R - 1; x++) map[x][0] = map[x + 1][0];
        for (int y = 0; y < C - 1; y++) map[R - 1][y] = map[R - 1][y + 1];
        for (int x = R - 1; x > down; x--) map[x][C - 1] = map[x - 1][C - 1];
        for (int y = C - 1; y > 1; y--) map[down][y] = map[down][y - 1];
        map[down][1] = 0;
    }
}