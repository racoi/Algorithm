import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[101][101];
        int ans = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        for(int i=0; i<N; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for(int x=x1; x<=x2; x++){
                for(int y=y1; y<=y2; y++){
                    arr[x][y]++;
                }
            }
        }
        
        for(int i=1; i<=100; i++){
            for(int j=1; j<=100; j++){
                if(arr[i][j] > M) ans++;
            }
        }
        System.out.println(ans);
    }
}