import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=0; tc<T; tc++){
            long N = sc.nextLong();
            long total = 0;
            for(int i=0; i<6; i++){
                total += sc.nextLong();
            }
            
            int day = 1;
            while(total <= N){
                total *= 4;
                day++;
            }
            System.out.println(day);
        }

    }
}