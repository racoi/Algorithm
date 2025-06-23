import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        char[][] map = new char[N][M];
        boolean[][] visited = new boolean[N][M];

        List<int[]> list = new ArrayList<>();

        for (int i=0; i<N; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        for (int i=1; i<N-1; i++) {
            for (int j=1; j<M-1; j++) {
                if (map[i][j] == '*') {
                    int cnt = 0;

                    while (true) {
                        cnt++;
                        boolean valid = true;
                        for (int d = 0; d < 4; d++) {
                            int nx = i + dx[d] * cnt;
                            int ny = j + dy[d] * cnt;
                            if (nx < 0 || ny < 0 || nx >= N || ny >= M || map[nx][ny] != '*') {
                                valid = false;
                                break;
                            }
                        }
                        if (!valid) {
                            cnt--;
                            break;
                        }
                    }

                    if (cnt > 0) {
                        list.add(new int[]{i + 1, j + 1, cnt});
                        visited[i][j] = true;
                        for (int l = 1; l <= cnt; l++) {
                            for (int d = 0; d < 4; d++) {
                                int nx = i + dx[d] * l;
                                int ny = j + dy[d] * l;
                                visited[nx][ny] = true;
                            }
                        }
                    }
                }
            }
        }

        boolean flag = false;
        for (int i = 0; i< N; i++) {
            for (int j = 0; j< M; j++) {
                if (map[i][j] == '*' && !visited[i][j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }

        if (flag) {
            System.out.println(-1);
        } else {
            System.out.println(list.size());
            for (int i=0; i<list.size(); i++) {
                int[] arr = list.get(i);
                System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
            }
        }
    }
}