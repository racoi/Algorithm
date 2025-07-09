import java.util.*;

public class Main {
    static int N, K;
    static int[][] arr;
    static int[] selected;
    static int minMax = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        arr = new int[N][2];
        selected = new int[K];
        
        for(int i=0; i<N; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        dfs(0, 0);
        System.out.println(minMax);
    }

    static void dfs(int idx, int depth){
        if(depth == K){
            int max = 0;
            for(int i=0; i<N; i++){
                int min = Integer.MAX_VALUE;
                for(int j=0; j<K; j++){
                    int shelter = selected[j];
                    int dist = Math.abs(arr[i][0] - arr[shelter][0]) + Math.abs(arr[i][1] - arr[shelter][1]);
                    min = Math.min(min, dist);
                }
                max = Math.max(max, min);
            }
            minMax = Math.min(minMax, max);
            return;
        }

        for(int i=idx; i<N; i++){
            selected[depth] = i;
            dfs(i+1, depth+1);
        }
    }
}