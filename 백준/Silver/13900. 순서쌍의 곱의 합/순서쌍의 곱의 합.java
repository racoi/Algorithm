import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long sum = 0;
        long tmp = 0;
        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            sum += num * tmp;
            tmp += num;
        }

        System.out.println(sum);
    }
}