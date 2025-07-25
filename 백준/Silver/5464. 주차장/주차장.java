import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] fee = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            fee[i] = sc.nextInt();
        }
        int[] car = new int[M + 1];
        for (int i = 1; i <= M; i++) {
            car[i] = sc.nextInt();
        }
        
        int[] arr = new int[M + 1]; // idx: 차량, val: 주차 공간
        PriorityQueue<Integer> q = new PriorityQueue<>(); // 비어있는 주차 공간
        Queue<Integer> tmp = new LinkedList<>(); // 대기 차량
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        int result = 0;
        for (int i = 0; i < 2 * M; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                if (q.isEmpty()) { // 주차 공간 없으면 대기
                    tmp.add(num);
                } else {
                    arr[num] = q.poll();
                }
            } else {
                num = Math.abs(num);
                result += car[num] * fee[arr[num]];

                if (!tmp.isEmpty()) {
                    arr[tmp.poll()] = arr[num];
                } else {
                    q.add(arr[num]);
                }
            }
        }
        System.out.println(result);
    }
}