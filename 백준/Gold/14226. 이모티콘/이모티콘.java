import java.util.*;

public class Main {
    static int S;
    static boolean[][] visited = new boolean[1001][1001];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        S = sc.nextInt();
        System.out.println(bfs());
    }

    public static int bfs(){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{1, 0, 0});
        visited[1][0] = true;
        
        while(!q.isEmpty()){
            int[] poll = q.poll();
            int num = poll[0];
            int clipboard = poll[1];
            int time = poll[2];

            if(S == num) return time;

            q.offer(new int[]{num, num, time+1});
            if(clipboard!=0 && num+clipboard<=S && !visited[num+clipboard][clipboard]){
                q.offer(new int[]{num+clipboard, clipboard, time+1});
                visited[num+clipboard][clipboard] = true;
            }
            if(num>0 && !visited[num-1][clipboard]){
                q.offer(new int[]{num-1, clipboard, time+1});
                visited[num-1][clipboard] = true;
            }
        }
        return -1;
    }
}