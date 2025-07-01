import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        Stack<int[]> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            if(input[0].equals("1")) {
                stack.push(new int[]{Integer.parseInt(input[1]), Integer.parseInt(input[2])});
            }

            if(!stack.isEmpty()) {
                int[] task = stack.peek();
                task[1]--;

                if(task[1] == 0) {
                    result += task[0];
                    stack.pop();
                }
            }
        }
        System.out.println(result);
    }
}