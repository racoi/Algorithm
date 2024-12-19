import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;
    static int[] num;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        visited = new boolean[N];
        num = new int[N];
        for(int i=0; i<N; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        dfs(0, 0);
        System.out.println(sb);
    }

    public static void dfs(int depth, int start){
        if(depth == M){
            for(int i : arr){
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i=start; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = num[i];
                dfs(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }
}