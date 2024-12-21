import java.io.*;
import java.util.*;

public class Main {
    static int k;
    static String[] arr;
    static boolean[] visited;
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        arr = br.readLine().split(" ");
        visited = new boolean[10];

        dfs(0, "");

        System.out.println(list.get(list.size() - 1));
        System.out.println(list.get(0));
    }

    public static void dfs(int depth, String num){
        if(depth == k + 1){
            list.add(num);
            return;
        }
        for(int i=0; i<10; i++){
            if(visited[i]) continue;
            if(depth == 0 || check(Character.getNumericValue(num.charAt(depth - 1)), i , arr[depth-1])) {
                visited[i] = true;
                dfs(depth + 1, num + i);
                visited[i] = false;
            }
        }
    }

    static boolean check(int num1, int num2, String s) {
        if (s.equals(">")) {
            if(num1 < num2) return false;
        } else if (s.equals("<")){
            if(num1 > num2) return false;
        }
        return true;
    }
}