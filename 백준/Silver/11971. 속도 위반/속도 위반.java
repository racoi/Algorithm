import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] lim =  new int[100];
        int[] yeon = new int[100];

        int idx = 0;
        for (int i = 0; i < N; i++) {
            int dist = sc.nextInt();
            int speed = sc.nextInt();
            for(int j=0; j<dist; j++){
                lim[idx++] = speed;
            }
        }

        idx = 0;
        for (int i = 0; i < M; i++) {
            int dist = sc.nextInt();
            int speed = sc.nextInt();
            for(int j=0; j<dist; j++){
                yeon[idx++] = speed;
            }
        }

        int max = 0;
        for(int i = 0; i <100; i++){
            max = Math.max(max, yeon[i] - lim[i]);
        }
        System.out.println(max);
    }
}