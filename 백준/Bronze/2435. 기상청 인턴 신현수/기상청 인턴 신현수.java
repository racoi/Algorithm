import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<N-K+1; i++){
            int sum = 0;
            for(int j=i; j<i+K; j++){
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}