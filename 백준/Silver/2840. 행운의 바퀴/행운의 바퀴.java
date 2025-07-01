import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        char[] arr = new char[N];
        for(int i =0; i < N; i++) {
            arr[i] = '?';
        }
        int idx =0;
        for(int i =0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());
            char ch = st.nextToken().charAt(0);
            int nextIdx = ((idx - tmp) % N + N) % N;
            if(arr[nextIdx] == '?') {
                arr[nextIdx] = ch;
            }
            else if(arr[nextIdx] != ch) {
                System.out.println("!");
                return;
            }
            idx = nextIdx;
        }

        boolean[] chk = new boolean[26];
        for (int i = 0; i < N; i++) {
            if (arr[i] == '?') continue;
            if (chk[arr[i] - 'A']) {
                System.out.println("!");
                return ;
            }
            chk[arr[i] - 'A'] = true;
        }
        for(int i =0; i < N; i++) {
            System.out.print(arr[(idx + i) % N]);
        }
        System.out.println();
    }
}