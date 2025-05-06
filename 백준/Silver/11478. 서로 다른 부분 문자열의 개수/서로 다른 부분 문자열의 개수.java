import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        String s = stk.nextToken();
        Set<String> set = new HashSet<>();

        for (int i = 0; i <s.length(); i++) {
            for (int j = i+1; j <s.length()+1; j++) {
                set.add(s.substring(i,j));
            }
        }

        System.out.println(set.size());
    }
}