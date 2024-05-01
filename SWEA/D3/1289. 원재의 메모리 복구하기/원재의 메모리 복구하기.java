import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String str = sc.next();
            
            char tmp = '0';
            int cnt = 0;
            for(int i=0; i<str.length(); i++){
            	if(str.charAt(i) != tmp){
                	tmp = str.charAt(i);
                    cnt++;
                }
            }
            
            System.out.println("#" + test_case + " " + cnt);
		}
	}
}