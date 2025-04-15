import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[K];
        
        int cnt = 0;
        int police = 0;
        for(int i=0; i<K+1; i++){
            int dir = sc.nextInt();
            int loc = sc.nextInt();
            int tmp = 0;
            
            switch (dir) {
            case 1:
                tmp = loc;
                break;
            case 2:
                tmp = N + M + N - loc;
                break;
            case 3:
                tmp = N + M + N + M - loc;
                break;
            case 4:
                tmp = N + loc;
                break;
            }
            if(i == K) police = tmp;
            else arr[i] = tmp;
        }
        for(int i=0; i<K; i++){
            int path1 = Math.abs(police - arr[i]);
            int path2 = N*2+M*2 - path1;
            cnt += Math.min(path1, path2);
        }
        System.out.println(cnt);
    }
}