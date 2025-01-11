import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N-1];
        for(int i=0; i<N-1; i++){
            arr[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        int result = 0;
        for(int i=0; i<N-1; i++){
            int price = sc.nextInt();
            min = Math.min(min, price);
            result += min * arr[i];
        }
        System.out.println(result);
    }
}