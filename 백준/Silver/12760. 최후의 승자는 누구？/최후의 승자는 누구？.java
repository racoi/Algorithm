import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        int[] score = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            Arrays.sort(arr[i]);
        }

        int maxCard;
        for (int i = 0; i < M; i++) {
            maxCard = -1;
            for (int j = 0; j < N; j++) {
                maxCard = Math.max(maxCard, arr[j][i]);
            }
            for (int j = 0; j < N; j++) {
                if(arr[j][i] == maxCard) score[j]++;
            }
        }

        int maxScore = -1;
        for (int i = 0; i < N; i++) {
            maxScore = Math.max(maxScore, score[i]);
        }
        for (int i = 0; i < N; i++) {
            if(score[i] == maxScore) System.out.print((i+1) + " ");
        }
    }
}