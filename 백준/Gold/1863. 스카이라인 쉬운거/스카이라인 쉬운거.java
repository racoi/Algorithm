import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<N; i++) {
            sc.nextInt();
            int y = sc.nextInt();

            while(!stack.isEmpty() && stack.peek() > y) {
                ans++;
                stack.pop();
            }

            if(!stack.isEmpty() && stack.peek() == y) continue;

            stack.push(y);
        }

        while(!stack.isEmpty()) {
            if (stack.peek() > 0) ans++;
            stack.pop();
        }

        System.out.println(ans);
    }
}