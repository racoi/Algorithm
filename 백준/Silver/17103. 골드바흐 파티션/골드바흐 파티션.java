import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        boolean[] num = new boolean[1000001];
        num[0] = num[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!num[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    num[j] = true;
                }
            }
        }

        while (T --> 0) {
            int N = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int j = 2; j <= N / 2; j++) {
                if (!num[j] && !num[N - j]) ans++;
            }
            System.out.println(ans);
        }
    }
}