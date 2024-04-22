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
			int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();
            
            int A = 0;
            A = P * W;
            
            int B = Q;
            if(W > R) B += S * (W - R);
            
            int ans = 0;
            if(A > B) ans = B;
            else ans = A;
            
            System.out.println("#" + test_case + " " + ans);
		}
	}
}