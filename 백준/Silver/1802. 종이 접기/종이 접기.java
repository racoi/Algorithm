import java.util.*;

public class Main {
    static String str;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=0; tc<T; tc++){
            str = sc.next();
            if(check(0, str.length() - 1)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean check(int start, int end){
        if(start >= end) return true;

        int mid = (start + end) / 2;
        for(int i=start; i<mid; i++) {
            if(str.charAt(i) == str.charAt(end-i)) return false;
        }

        return check(start, mid - 1) && check(mid + 1, end);
    }
}