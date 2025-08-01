import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
        }

        int[] tmp = new int[N];
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                tmp[D[j] - 1] = S[j];
            }

            for (int j = 0; j < N; j++) S[j] = tmp[j];
        }

        for(int i : S){
            System.out.print(i + " ");
        }
    }
}