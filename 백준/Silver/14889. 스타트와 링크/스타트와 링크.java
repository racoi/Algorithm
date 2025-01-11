import java.util.*;

public class Main {
    static int N;
    static int[][] arr;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][N];
        visited = new boolean[N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        comb(0, 0);
        System.out.println(min);
    }

    public static void comb(int idx, int cnt){
        if(cnt == N / 2){
            diff();
            return;
        }

        for(int i=idx; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                comb(i + 1, cnt + 1);
                visited[i] = false;
            }
        }
    }

    public static void diff(){
        int start = 0;
        int link = 0;

        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(visited[i] && visited[j]) start += arr[i][j] + arr[j][i];
                else if(!visited[i] && !visited[j]) link += arr[i][j] + arr[j][i];
            }
        }
        int result = Math.abs(start - link);
        
        if(result == 0){
            System.out.println(0);
            System.exit(0);
        }

        min = Math.min(min, result);
    }
}