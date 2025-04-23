import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            int M = sc.nextInt();
            for(int j=0; j<M; j++){
                arr[i] += sc.nextInt();
            }
        }

        Arrays.sort(arr);
        
        long tmp = 0;
        long ans = 0;
        for(int i=0; i<N; i++){
            tmp += arr[i];
            ans += tmp;
        }

        System.out.println(ans);
    }
}