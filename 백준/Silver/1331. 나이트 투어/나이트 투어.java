import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> visited = new HashSet<>();
        
        String first = br.readLine();
        int startX = first.charAt(0) - 'A';
        int startY = first.charAt(1) - '1';
        int prevX = startX;
        int prevY = startY;
        visited.add(first);

        for (int i = 1; i < 36; i++) {
            String move = br.readLine();
            int currX = move.charAt(0) - 'A';
            int currY = move.charAt(1) - '1';

            if (visited.contains(move)) {
                System.out.println("Invalid");
                return;
            }

            int dx = Math.abs(currX - prevX);
            int dy = Math.abs(currY - prevY);
            if (!((dx == 2 && dy == 1) || (dx == 1 && dy == 2))) {
                System.out.println("Invalid");
                return;
            }

            visited.add(move);
            prevX = currX;
            prevY = currY;
        }

        int dx = Math.abs(startX - prevX);
        int dy = Math.abs(startY - prevY);
        if (!((dx == 2 && dy == 1) || (dx == 1 && dy == 2))) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }
}