import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int[] arr = new int[N];
        boolean[] visited = new boolean[N];
        
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        int cnt = 0;
        int curr = 0;
        
        while(!visited[curr]){
            if(curr == K){
                System.out.println(cnt);
                return;
            }
            visited[curr] = true;
            curr = arr[curr];
            cnt++;
        }
        System.out.println(-1);
    }
}