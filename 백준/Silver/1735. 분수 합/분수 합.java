import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        int result_a = (a1 * b2) + (a2 * b1);
        int result_b = b1 * b2;
        int gcd = getGcd(result_a, result_b);

        System.out.println(result_a/gcd + " " + result_b/gcd);
    }

    public static int getGcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return getGcd(b, a % b);
    }
}