import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt(); //15
        int S = sc.nextInt(); //28
        int M = sc.nextInt(); //19

        int day = 1;
        while(true){
            if(E==1 && S==1 && M==1) break;
            
            if(E == 1) E = 15;
            else E--;
            if(S == 1) S = 28;
            else S--;
            if(M == 1) M = 19;
            else M--;

            day++;
        }

        System.out.println(day);
    }
}