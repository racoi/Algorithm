import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        for(int test_case = 1; test_case <= 10; test_case++)
        {
            int tc = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            int cnt = 0;

            for(int i=0; i<=b.length()-a.length(); i++){
                if(a.equals(b.substring(i, i+a.length()))){
                    cnt++;
                }
            }

            System.out.println("#" + tc + " " + cnt);
        }
    }
}