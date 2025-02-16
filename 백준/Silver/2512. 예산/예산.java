import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int right = -1;
        int left = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            right = Math.max(right, arr[i]);
        }

        int M = sc.nextInt();

        while (left <= right) {
            int mid = (left + right) / 2;
            int budget = 0;
            for(int i = 0; i < N; i++){
                if(arr[i] > mid) budget += mid;
                else budget += arr[i];
            }
            if(budget > M) right = mid - 1;
            else left = mid + 1;
        }
        System.out.println(right);
    }
}