import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int K = sc.nextInt();

        int ans = 0;

        int[][] star = new int[K][2];
        for(int i=0; i<K; i++){
            star[i][0] = sc.nextInt();
            star[i][1] = sc.nextInt();
        }

        for(int i=0; i<K; i++){
            for(int j=0; j<K; j++){
                int x = star[i][0];
                int y = star[j][1];
                int cnt = 0;
                for(int[] dot : star){
                    if(x <= dot[0] && x + L >= dot[0] && y <= dot[1] && y + L >= dot[1]){
                        cnt++;
                    }
                }
                ans = Math.max(ans, cnt);
            }
        }
        System.out.println(K - ans);
    }
}