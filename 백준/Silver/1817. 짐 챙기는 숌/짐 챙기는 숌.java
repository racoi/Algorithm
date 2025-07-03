import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int tmp = 0;
        int cnt = 0;
        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            tmp += num;
            if(tmp > M){
                cnt++;
                tmp = num;
            }
        }
        if(tmp > 0) cnt++;
        System.out.println(cnt);
    }
}