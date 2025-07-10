import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();

        for(int i=1; i<=N; i++){
            dq.offer(i);
        }

        boolean flag = true;
        int cnt = 0;

        while(!dq.isEmpty()){
            for(int i=0; i<K-1; i++){
                if(flag) dq.addLast(dq.pollFirst());
                else dq.addFirst(dq.pollLast());
            }

            int removed = flag ? dq.pollFirst() : dq.pollLast();
            cnt++;

            System.out.println(removed);

            if (cnt == M) {
                flag = !flag;
                cnt = 0;
            }
        }
    }
}