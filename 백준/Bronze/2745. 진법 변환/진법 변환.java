import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int N = sc.nextInt();
        
        int idx = 0;
        int num = 0;
        long result = 0;
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9') num = ch - '0';
            else num = ch - 55;
            result += num * Math.pow(N, idx++);
        }
        System.out.println(result);
    }
}