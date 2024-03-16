import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        boolean[][] p = new boolean[100][100];
        
        int N = sc.nextInt();
        
        int x = 0;
        int y = 0;
        int total = 0;
        for(int i=0; i<N; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            
            for(int a=x; a<x+10; a++){
                for(int b=y; b<y+10; b++){
                    if(!p[a][b]){
                        p[a][b] = true;
                        total++;
                    }
                }
            }
        }
        System.out.println(total);
    }
}