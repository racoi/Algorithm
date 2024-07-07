import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int N;
    static ArrayList<Integer>[] list;
    static int[] parent;
    static boolean[] visited;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        list = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            list[i] = new ArrayList<>();
        }
        parent = new int[N+1];
        visited = new boolean[N+1];

        for(int i=1; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }

        q.offer(1);
        visited[1] = true;
        bfs();

        for(int i=2; i<=N; i++){
            System.out.println(parent[i]);
        }
    }

    public static void bfs(){
        while(!q.isEmpty()){
            int n = q.poll();
            for(int node : list[n]){
                if(!visited[node]){
                    parent[node] = n;
                    q.offer(node);
                    visited[node] = true;
                }
            }
        }
    }
}