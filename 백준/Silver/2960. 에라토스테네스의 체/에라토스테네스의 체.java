import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N + 1];
        for(int i=2; i<=N; i++){
            arr[i] = i;
        }

        int cnt = 0;
        for(int i=2; i<=N; i++){
            if(arr[i] == 0) continue;

            for(int j=i; j<=N; j+=i){
                if(arr[j] != 0){
                    arr[j] = 0;
                    cnt++;
                    if(cnt == K){
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
    }
}