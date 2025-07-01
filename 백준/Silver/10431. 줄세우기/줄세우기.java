import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<T+1; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer.parseInt(st.nextToken());

            int cnt = 0;
            int[] num = new int[20];
            for (int i=0; i<20; i++) {
                num[i] = Integer.parseInt(st.nextToken());
            }

            for (int i=0; i<20; i++) {
                for (int j=0; j<i; j++) {
                    if (num[j] > num[i]) cnt++;
                }
            }
            System.out.println(tc + " " + cnt);
        }
    }
}