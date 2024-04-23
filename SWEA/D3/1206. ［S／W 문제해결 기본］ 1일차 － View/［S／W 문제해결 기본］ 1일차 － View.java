import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int N = sc.nextInt();
            
            int[] arr = new int[N];
            for(int i=0; i<N; i++){
            	arr[i] = sc.nextInt();
            }
            
            int sum = 0;
            for(int i=2; i<=N-3; i++){
            	int tmp = arr[i];
                int max = 0;
                for(int j=i-2; j<i; j++){
                	if(arr[j] > max) max = arr[j];
                }
                for(int j=i+1; j<i+3; j++){
                	if(arr[j] > max) max = arr[j];
                }
                if(tmp > max){
                	sum += tmp - max;
                }
            }
			
            System.out.println("#" + test_case + " " + sum);
		}
	}
}