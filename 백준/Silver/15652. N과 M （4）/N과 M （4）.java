import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];

        dfs(0, 0);
        System.out.print(sb);
    }

    public static void dfs(int depth, int now) {
        if(depth == M) {
            for(int i : arr){
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i=now; i<N; i++){
            arr[depth] = i + 1;
            dfs(depth + 1, i);
        }
    }
}