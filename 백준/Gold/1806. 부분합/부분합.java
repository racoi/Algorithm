import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] arr = new int[N + 1];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = 0;
        int total = 0;
        int min = Integer.MAX_VALUE;

        while(left <= N && right <= N){
            if(total >= S && min > right - left) min = right - left;

            if(total < S) total += arr[right++];
            else total -= arr[left++];
        }

        if(min == Integer.MAX_VALUE) System.out.println("0");
        else System.out.println(min);
    }
}