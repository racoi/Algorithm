import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(combination(M - 1, N - 1));
    }

    public static BigInteger combination(int a, int b) {
        return factorial(a).divide(factorial(b).multiply(factorial(a - b)));
    }

    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}