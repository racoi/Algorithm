import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] arr;
        
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            long ans = 0;
            st = new StringTokenizer(br.readLine()," ");
            
            arr = new int[N];
            for(int j=0; j<N; j++) arr[j] = Integer.parseInt(st.nextToken());
            
            int max = arr[N-1];
            for(int j=N-2; j>=0; j--) {
                if(arr[j] <= max) ans += max - arr[j];
                else max = arr[j];
            }
            bw.write(ans + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}