import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if(K == 0 || K == N){
            System.out.println(1);
            return;
        }

        System.out.println(factorial(N) / (factorial(N-K) * factorial(K)));
    }

    public static long factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }
}