import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=0; tc<T; tc++){
            int num = sc.nextInt();
            int ans = 0;
            while (num != 6174) {
                int[] arr = new int[4];
                for (int i = 0; i < 4; i++) {
                    arr[i] = num % 10;
                    num /= 10;
                }
                Arrays.sort(arr);

                int min = 0;
                int max = 0;
                for (int i = 0; i < 4; i++) {
                    min = min * 10 + arr[i];
                    max = max * 10 + arr[3 - i];
                }
                num = max - min;
                ans++;
            }
            System.out.println(ans);
        }
    }
}