import java.util.*;

public class Main {
    static String S;
    static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        String T = sc.next();

        dfs(T);
        System.out.println(result);
    }

    public static void dfs(String T){
        if(T.length() == S.length()){
            if(T.equals(S)) result = 1;
            return;
        }

        if(T.charAt(T.length()-1) == 'A') dfs(T.substring(0, T.length() - 1));
        if(T.charAt(0) == 'B') dfs(new StringBuilder(T.substring(1)).reverse().toString());
    }
}