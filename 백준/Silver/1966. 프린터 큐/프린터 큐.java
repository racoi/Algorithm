import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=0; tc<T; tc++){
            int N = sc.nextInt();
            int M = sc.nextInt();

            LinkedList<int[]> q = new LinkedList<>();
            for(int i=0; i<N; i++){
                q.offer(new int[] {i, sc.nextInt()});
            }

            int cnt = 0;
            while(!q.isEmpty()){
                int[] poll = q.poll();
                boolean isMax = true;

                for(int i=0; i<q.size(); i++){
                    if(poll[1] < q.get(i)[1]){
                        q.offer(poll);
                        isMax = false;
                        break;
                    }
                }
                if(!isMax) continue;

                cnt++;
                if(poll[0] == M) break;
            }

            System.out.println(cnt);
        }
    }
}