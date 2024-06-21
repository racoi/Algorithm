import java.util.Scanner;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t=0; t<T; t++){
            LinkedList<int[]> q = new LinkedList<>();
            
            int N = sc.nextInt();
            int M = sc.nextInt();

            for(int i=0; i<N; i++){
                q.offer(new int[] {i, sc.nextInt()});
            }

            int cnt = 0;
            while(!q.isEmpty()){
                int[] front = q.poll();
                boolean isMax = true;

                for(int i=0; i<q.size(); i++){
                    if(front[1] < q.get(i)[1]){
                        q.offer(front);
                        for(int j = 0; j < i; j++) {
							q.offer(q.poll());
						}
                        isMax = false;
                        break;
                    }
                }

                if(!isMax) continue;

                cnt++;
                if(front[0] == M) break;
            }

            System.out.println(cnt);
        }
    }
}