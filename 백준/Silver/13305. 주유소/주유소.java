import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N-1];
        for(int i=0; i<N-1; i++){
            arr[i] = sc.nextLong();
        }

        long min = sc.nextLong();
        long result = min * arr[0];
        for(int i=1; i<N-1; i++){
            long price = sc.nextLong();
            min = Math.min(min, price);
            result += min * arr[i];
        }
        System.out.println(result);
    }
}