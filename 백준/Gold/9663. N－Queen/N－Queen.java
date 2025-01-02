import java.util.*;

public class Main {
    static int N;
    static int[] arr;
    static int cnt = 0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];

        dfs(0);
        System.out.println(cnt);
    }

    public static void dfs(int col){
        if(col == N){
            cnt++;
            return;
        }
        for(int i=0; i<N; i++){
            arr[col] = i;
            if(isPossible(col)) dfs(col + 1);
        }
    }

    public static boolean isPossible(int col){
        for(int i=0; i<col; i++){
            if(arr[col] == arr[i]) return false;
            else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) return false;
        }
        return true;
    }
}