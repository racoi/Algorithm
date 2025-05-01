import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[1000001];
        prime[0] = prime[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!prime[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    prime[j] = true;
                }
            }
        }

        while (T --> 0) {
            int N = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int j = 2; j <= N / 2; j++) {
                if (!prime[j] && !prime[N - j]) ans++;
            }
            System.out.println(ans);
        }
    }
}