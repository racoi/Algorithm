import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            arr[i] = sum;
        }

        Arrays.sort(arr);
        long tmp = 0;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            tmp += arr[i];
            ans += tmp;
        }

        System.out.println(ans);
    }
}