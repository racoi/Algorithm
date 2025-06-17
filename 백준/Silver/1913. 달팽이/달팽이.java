import java.io.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        int x = N/2;
        int y = N/2;
        int num = 1;
        arr[x][y] = num;

        int idx = 0;
        while(true){
            x += dx[idx];
            y += dy[idx];

            if(x<0 || y<0 || x>=N || y>=N) break;

            if(idx != 3){
                if(arr[x + dx[idx+1]][y + dy[idx+1]] == 0) idx++;
            }else{
                if(arr[x + dx[0]][y + dy[0]] == 0) idx = 0;
            }

            num++;
            arr[x][y] = num;
        }

        int nx = 0, ny = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j] == M){
                    nx = i + 1;
                    ny = j + 1;
                }
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }
        sb.append(nx + " " + ny);
        System.out.println(sb.toString());
    }
}