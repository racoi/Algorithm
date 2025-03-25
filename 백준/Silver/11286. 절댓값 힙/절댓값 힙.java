import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int absCompare = Integer.compare(Math.abs(a), Math.abs(b));
            if (absCompare == 0) {
                return Integer.compare(a, b);  // 절대값이 같으면 음수 값이 우선
            }
            return absCompare;
        });

        for(int i=0; i<N; i++) {
            int num = sc.nextInt();
            if(num == 0){
                if(pq.isEmpty()) System.out.println(0);
                else System.out.println(pq.poll());
                continue;
            }
            pq.offer(num);
        }
    }
}