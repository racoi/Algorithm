import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];

        for(int i=0; i<N; i++){
            String str = sc.next();
            for(int j=0; j<M; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        int len = Math.min(N, M);
        while(len > 1){
            for(int i=0; i<=N-len; i++){
                for(int j=0; j<=M-len; j++){
                    int num = arr[i][j];
                    if(num == arr[i][j+len-1] && num == arr[i+len-1][j] && num == arr[i+len-1][j+len-1]){
                        System.out.println(len * len);
                        return;
                    }
                }
            }
            len--;
        }
        System.out.println(len * len);
    }
}