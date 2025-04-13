import java.util.*;

public class Main {
    static boolean[] visited;
    static HashMap<Integer, Integer> move;
    static int res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        visited = new boolean[101];
        move = new HashMap<>();

        for(int i=0; i<N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            move.put(x, y);
        }

        for(int i=0; i<M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            move.put(u, v);
        }

        bfs();
        System.out.println(res);
    }

    public static void bfs(){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++) {
                int poll = q.poll();

                for(int dice=1; dice<=6; dice++){
                    int next = poll + dice;

                    if(next > 100) continue;

                    if(move.containsKey(next)) next = move.get(next);

                    if(next == 100){
                        res++;
                        return;
                    }

                    if(!visited[next]){
                        visited[next] = true;
                        q.add(next);
                    }
                }
            }
            res++;
        }
    }
}