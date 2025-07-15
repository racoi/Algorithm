import java.util.*;

public class Main{
    static int T;
    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        arr = new int[T+1][8];
        for(int i=1; i<=T; i++){
            String str = sc.next();
            for(int j=0; j<8; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        int K = sc.nextInt();
        for(int i=0; i<K; i++){
            int num = sc.nextInt();
            int dir = sc.nextInt();

            visited = new boolean[T+1];
            solve(num, dir);
        }

        int ans = 0;
        for(int i=1; i<=T; i++){
            if(arr[i][0] == 1) ans++;
        }
        System.out.println(ans);
    }

    static void solve(int num, int dir){
        visited[num] = true;

        if(num > 1 && !visited[num-1] && arr[num - 1][2] != arr[num][6]){
            solve(num - 1, dir * -1);
        }
        if (num < T && !visited[num+1] && arr[num + 1][6] != arr[num][2]){
            solve(num + 1, dir * -1);
        }

        rotate(num, dir);
    }

    static void rotate(int num, int dir){
        if(dir == 1){ // 시계 방향
            int tmp = arr[num][7];
            for(int i=7; i>=1; i--) arr[num][i] = arr[num][i-1];
            arr[num][0] = tmp;
        }else{ // 반시계 방향
            int tmp = arr[num][0];
            for (int i = 0; i < 7; i++) arr[num][i] = arr[num][i+1];
            arr[num][7] = tmp;
        }
    }
}