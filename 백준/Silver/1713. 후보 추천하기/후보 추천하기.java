import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int total = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] student = new int[N];
        int[] recommend = new int[N];
        int[] time = new int[N];

        for (int i=0; i<total; i++) {
            int num = Integer.parseInt(st.nextToken());
            int idx = 0;

            for (int j=0; j<N; j++) {
                if (student[j]==0 || student[j]==num) {
                    idx = j;
                    break;
                }
                else if (recommend[idx] > recommend[j] || (recommend[idx] == recommend[j] && time[idx] > time[j])) {
                    idx = j;
                }
            }

            if(student[idx] != num){
                student[idx] = num;
                recommend[idx] = 0;
                time[idx] = i;
            }
            recommend[idx]++;
        }

        Arrays.sort(student);

        for(int i : student){
            if(i != 0)
                bw.write(i + " ");
        }
        bw.flush();
    }
}