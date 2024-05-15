import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int tc = sc.nextInt();
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int result = 1;
            for(int i=0; i<M; i++){
            	result = result * N;
            }
            
            System.out.println("#" + tc + " " + result);
		}
	}
}