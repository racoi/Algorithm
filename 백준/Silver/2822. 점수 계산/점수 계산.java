import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[8][2];
        int[] num = new int[5];
        for(int i=0; i<8; i++){
            arr[i][0] = i + 1;
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, (int[] a, int[] b) -> {
            return b[1] - a[1];
        });

        int sum = 0;
        for(int i=0; i<5; i++){
            sum += arr[i][1];
            num[i] = arr[i][0];
        }

        System.out.println(sum);
        Arrays.sort(num);
        for(int i=0; i<5; i++){
            System.out.print(num[i] + " ");
        }
    }
}