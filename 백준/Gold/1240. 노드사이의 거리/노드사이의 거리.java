import java.util.*;

public class Main{
    static int[][] node;
    static int[][] dist;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        node = new int[N+1][N+1];
        dist = new int[N+1][N+1];

        for(int i=0; i<N-1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();
            node[a][b] = 1;
            node[b][a] = 1;
            dist[a][b] = d;
            dist[b][a] = d;
        }

        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            bfs(a, b, N);
        }
    }

    static void bfs(int start, int end, int N){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[N+1];

        q.offer(start);
        visited[start] = true;
        int[] res = new int[N+1];

        while(!q.isEmpty()){
            int poll = q.poll();
            for(int i=1; i<=N; i++){
                if(node[poll][i] == 1 && !visited[i]){
                    res[i] += dist[poll][i] + res[poll];

                    if(i == end){
                        System.out.println(res[end]);
                        return;
                    }

                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}