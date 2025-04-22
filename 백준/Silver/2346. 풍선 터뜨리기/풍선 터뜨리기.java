import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<int[]> q = new ArrayDeque<>();

        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("1 ");
        int in = arr[0];

        for(int i=1; i<N; i++){
            q.add(new int[] {(i+1), arr[i]});
        }

        while(!q.isEmpty()) {
            if(in >0) {
                for(int i=1; i<in; i++) {
                    q.add(q.poll());
                }

                int[] nxt = q.poll();
                in = nxt[1];
                System.out.print(nxt[0]+" ");
            }else{
                for(int i=1; i<-in; i++	) {
                    q.addFirst(q.pollLast());
                }

                int[] nxt = q.pollLast();
                in = nxt[1];
                System.out.print(nxt[0]+" ");
            }
        }
    }
}