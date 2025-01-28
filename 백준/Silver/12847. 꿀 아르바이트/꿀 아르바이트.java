import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long max = 0;
        for (int i = 0; i < n-m; i++) {
            long sum = 0;
            for (int j = i; j < i+m; j++) {
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}