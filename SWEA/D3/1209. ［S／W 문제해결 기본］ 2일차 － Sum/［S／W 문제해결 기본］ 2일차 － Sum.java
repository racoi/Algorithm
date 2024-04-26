import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            sc.nextInt();
            
            int[][] arr = new int[100][100];
            
			for(int i = 0; i < 100; i++) {
                for(int j = 0; j < 100; j++) {     
                    arr[i][j] = sc.nextInt();
                }
            } 
            
            int maxSum = -1;
            int dSum1 = 0;
            int dSum2 = 0;
            
            for(int i = 0; i < 100; i++) {
            	int rSum = 0;
                int cSum = 0;
                for(int j = 0; j < 100; j++) {
                	rSum += arr[i][j];
                    cSum += arr[j][i];
            	}
                maxSum = Math.max(maxSum, Math.max(rSum, cSum));
                
                dSum1 += arr[i][i];
                dSum2 += arr[i][99-i];
            }
            maxSum = Math.max(maxSum, Math.max(dSum1, dSum2));
            
            System.out.println("#" + test_case + " " + maxSum);
		}
	}
}