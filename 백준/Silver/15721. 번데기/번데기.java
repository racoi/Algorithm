import java.util.*;

public class Main {
    static int A;
    static int T;
    static int bd;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        T = sc.nextInt();
        bd = sc.nextInt();

        System.out.println(solve());
    }

    static int solve() {
        int b = 0, d = 0;
        int n = 2;
        while (true) {
            for (int i = 0; i < 4; i++) {
                if (i % 2 == 0) {
                    b++;
                    if (b == T && bd == 0) return (b + d - 1) % A;
                }
                else {
                    d++;
                    if (d == T && bd == 1) return (b + d - 1) % A;
                }
            }

            for (int i = 0; i < n; i++) {
                b++;
                if (b == T && bd == 0) return (b + d - 1) % A;
            }

            for (int i = 0; i < n; i++) {
                d++;
                if (d == T && bd == 1) return (b + d - 1) % A;
            }
            n++;
        }
    }
}