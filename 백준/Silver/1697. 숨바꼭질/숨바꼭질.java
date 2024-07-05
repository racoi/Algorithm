import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    static int N, K;
    static int visited[] = new int[100001];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        System.out.println(bfs(N));
    }

    public static int bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        visited[start] = 1;
        q.offer(start);
        int n = 0;
        while(!q.isEmpty()){
            n = q.poll();
            if(n == K){
                return visited[n] - 1;
            }
            if(n-1>=0 && visited[n-1] == 0){
                visited[n-1] = visited[n] + 1;
                q.offer(n-1);
            }
            if(n+1<=100000 && visited[n+1] == 0){
                visited[n+1] = visited[n] + 1;
                q.offer(n+1);
            }
            if(n*2<=100000 && visited[n*2] == 0){
                visited[n*2] = visited[n] + 1;
                q.offer(n*2);
            }
        }
        return -1;
    }
}