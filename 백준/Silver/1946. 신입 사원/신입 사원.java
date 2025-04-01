import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=0; tc<T; tc++){
            int N = sc.nextInt();
            int[] arr = new int[N+1];
            for(int i=0; i<N; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[a] = b;
            }

            int rating = arr[1];
            int cnt = 1;
            for(int i=2; i<=N; i++){
                if(rating > arr[i]){
                    rating = arr[i];
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}