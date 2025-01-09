import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char prev = str.charAt(0);
        int cnt = 0;
        for(int i=1; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != prev) cnt++;
            prev = ch;
        }

        if(cnt == 0) System.out.println(0);
        else if(cnt % 2 == 0) System.out.println(cnt / 2);
        else System.out.println(cnt / 2 + 1);
    }
}