import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int max = 0;
        int cnt = 0;
        int cntMax = 0;
        for(int i=0; i<N; i++){
            int n = sc.nextInt();
            if(n > max){
                max = Math.max(max, n);
                cntMax = Math.max(cntMax, cnt);
                cnt = 0;
                continue;
            }
            cnt++;
        }
        cntMax = Math.max(cntMax, cnt);
        System.out.println(cntMax);
    }
}