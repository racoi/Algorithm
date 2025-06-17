import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int idx = S.length() - 1;
        for(int i=0; i<idx; i++) {
            if(isPalindrome(S.substring(i))) {
                idx = i;
                break;
            }
        }
        System.out.println(S.length() + idx);
    }
    
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}