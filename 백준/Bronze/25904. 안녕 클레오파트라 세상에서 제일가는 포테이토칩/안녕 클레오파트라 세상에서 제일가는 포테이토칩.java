import java.util.*;

public class Main {
    static int N, X;
    static int[] arr;
    static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        X = sc.nextInt();
        arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        solve();
        System.out.println(result);
    }

    public static void solve(){
        while(true){
            for(int i=0; i<N; i++){
                if(arr[i] < X){
                    result = i + 1;
                    return;
                }
                X++;
            }
        }
    }
}