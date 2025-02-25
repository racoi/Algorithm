import java.util.*;

public class Main {
    static int[] arr;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int min = 1;
        int max = arr[N - 1] - arr[0] + 1;

        while(min < max){
            int mid = (min + max) / 2;

            if(solve(mid) < M) max = mid;
            else min = mid + 1;
        }

        System.out.println(min - 1);
    }

    public static int solve(int dist){
        int cnt = 1;
        int lastLoc = arr[0];

        for(int i=1; i<arr.length; i++){
            int loc = arr[i];

            if(loc - lastLoc >= dist){
                cnt++;
                lastLoc = loc;
            }
        }
        return cnt;
    }
}