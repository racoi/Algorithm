import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int R = Integer.parseInt(inputs[0]);
        int C = Integer.parseInt(inputs[1]);
        int N = Integer.parseInt(inputs[2]);

        char[][] map = new char[R][C];
        int[][] bomb = new int[R][C];

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j);
                if(map[i][j]=='O'){
                    bomb[i][j] = 3;
                }
            }
        }

        int time = 0;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while(time++ < N) {
            if(time % 2 == 0) {
                for (int i = 0; i < R; i++) {
                    for (int j = 0; j < C; j++) {
                        if (map[i][j] == '.') {
                            map[i][j] = 'O';
                            bomb[i][j] = time + 3;
                        }
                    }
                }
            }else if(time % 2 == 1) {
                for (int i = 0; i < R; i++) {
                    for (int j = 0; j < C; j++) {
                        if (bomb[i][j] == time) {
                            map[i][j] = '.';
                            for (int d = 0; d < 4; d++) {
                                int nx = i + dx[d];
                                int ny = j + dy[d];

                                if (nx<0 || ny<0 || nx>=R || ny>=C) continue;

                                if(map[nx][ny]=='O' && bomb[nx][ny] != time) {
                                    map[nx][ny] = '.';
                                    bomb[nx][ny] = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < R; i++) {
            System.out.println(map[i]);
        }
    }
}