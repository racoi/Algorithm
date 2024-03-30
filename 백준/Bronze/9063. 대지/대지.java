import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        int max_x = -10000;
        int min_x = 10000;
        int max_y = -10000;
        int min_y = 10000;
        
        for(int i=0; i<N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(max_x < x) max_x = x;
            if(min_x > x) min_x = x;
            
            if(max_y < y) max_y = y;
            if(min_y > y) min_y = y;
        }
        
        System.out.println((max_x - min_x) * (max_y - min_y));
    }
}