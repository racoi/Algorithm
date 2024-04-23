import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int d = sc.nextInt();
            
            int[] arr = new int[101];
            for(int i=0; i<100; i++){
            	arr[i] = sc.nextInt();
            }
            
			for(int i=0; i<d; i++){
            	int min = 101;
                int max = 0;
                int max_index = 0;
                int min_index = 0;
                
                for(int j=0; j<100; j++){
                    if(arr[j] > max){
                    	max = arr[j];
                        max_index = j;
                    }
                    if(arr[j] < min){
                    	min = arr[j];
                        min_index = j;
                    }
                }
                arr[max_index]--;
                arr[min_index]++;
            }
            
            int min = 101;
            int max = 0;
            for(int i=0; i<100; i++){
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
            }
            int result = max - min;
            System.out.println("#" + test_case + " " + result);
		}
	}
}