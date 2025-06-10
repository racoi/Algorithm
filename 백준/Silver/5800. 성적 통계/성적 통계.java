import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        for(int t = 1; t <= K; t++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int gap = 0;
            for(int i = 0; i < N-1; i++) {
                gap = Math.max(gap, arr[i+1] - arr[i]);
            }

            System.out.println("Class " + t);
            System.out.println("Max " + arr[N - 1] + ", Min " + arr[0] + ", Largest gap " + gap);
        }
    }
}