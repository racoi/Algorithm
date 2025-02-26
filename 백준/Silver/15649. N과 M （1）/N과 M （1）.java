import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        visited = new boolean[N];
        
        dfs(0);
    }
    
    public static void dfs(int depth){
        if(depth == M){
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        
        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}