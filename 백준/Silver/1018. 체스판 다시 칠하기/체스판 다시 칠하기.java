import java.util.Scanner;

public class Main{
    public static int min = 64;
    public static boolean[][] arr;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        arr = new boolean[N][M];
        
        for(int i=0; i<N; i++){
            String str = sc.next();
            for(int j=0; j<M; j++){
                if(str.charAt(j) == 'W'){
                    arr[i][j] = true;
                } else{
                    arr[i][j] = false;
                }
            }
        }
        
        for(int i=0; i<N-7; i++){
            for(int j=0; j<M-7; j++){
                find(i, j);
            }
        }
        
        System.out.println(min);
    }
    
    public static void find(int x, int y){
        int cnt = 0;
        int result = 0;
        boolean TF = arr[x][y]; //첫번째 칸
        
        for(int i=x; i<x+8; i++){
            for(int j=y; j<y+8; j++){
                if(arr[i][j] != TF){
                    cnt++;
                }
                TF = (!TF);
            }
            TF = (!TF);
        }
        result = Math.min(cnt, 64-cnt);
        min = Math.min(min, result);
    }
}