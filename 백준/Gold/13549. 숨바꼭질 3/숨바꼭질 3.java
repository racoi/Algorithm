import java.util.*;

public class Main {
    static int N, K;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        visited = new boolean[100001];

        bfs();
        System.out.println(min);

    }

    public static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {N, 0});

        while(!q.isEmpty()){
            int[] poll = q.poll();
            int loc = poll[0];
            int time = poll[1];
            visited[loc] = true;

            if(loc == K) min = Math.min(min, time);

            if(loc * 2 <= 100000 && !visited[loc * 2]) q.offer(new int[] {loc * 2, time});
            if(loc + 1 <= 100000 && !visited[loc + 1]) q.offer(new int[] {loc + 1, time + 1});
            if(loc - 1 >= 0 && !visited[loc - 1]) q.offer(new int[] {loc - 1, time + 1});
        }
    }
}