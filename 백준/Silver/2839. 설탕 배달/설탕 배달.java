import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for(int i=N; i>0; i-=3){
            if(i % 5 == 0){
                cnt += i / 5;
                break;
            }
            if(i < 3){
                cnt = -1;
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}