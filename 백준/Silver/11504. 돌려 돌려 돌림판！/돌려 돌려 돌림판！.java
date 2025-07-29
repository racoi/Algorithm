import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] input;
        for(int tc=0; tc<T; tc++){
            input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            
            int X = Integer.parseInt(br.readLine().replaceAll(" ", ""));
            int Y = Integer.parseInt(br.readLine().replaceAll(" ", ""));
            String status = br.readLine().replaceAll(" ", "");
            for(int i=0; i<M-1; i++){
                status += status.charAt(i);
            }

            int res = 0;
            for(int i=0; i<N; i++){
                String tmp = "";
                for(int j=i; j<i+M; j++){
                    tmp += status.charAt(j);
                }
                if(Integer.parseInt(tmp) >= X && Integer.parseInt(tmp) <= Y) res++;
            }
            System.out.println(res);
        }
    }
}