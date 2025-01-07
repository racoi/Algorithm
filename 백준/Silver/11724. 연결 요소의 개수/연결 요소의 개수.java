import java.util.*;

public class Main {
    static int N;
    static int[][] arr;
    static boolean[] visited;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = arr[b][a] = 1;
        }

        int cnt = 0;
        for(int i=1; i<N+1; i++){
            if(!visited[i]){
                cnt++;
                bfs(i);
            }
        }
        System.out.println(cnt);
    }

    public static void bfs(int node){
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        visited[node] = true;
        while (!q.isEmpty()){
            int n = q.poll();
            for(int i=1; i<N+1; i++){
                if(arr[n][i] == 1 && !visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}