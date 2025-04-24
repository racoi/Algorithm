import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int leaf = 0;
        if(M == 2) leaf = 1;

        int tmp = 0;
        for (int i = 1; i < N; i++) {
            if(M > leaf){
                System.out.println(0 + " " + i);
                leaf++;
            }else{
                System.out.println(tmp + " " + i);
            }
            tmp = i;
        }
    }
}