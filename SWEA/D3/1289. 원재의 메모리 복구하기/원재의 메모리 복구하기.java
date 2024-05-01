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
            int[] arr = new int[str.length()];
            
            for(int i=0; i<arr.length; i++){
            	arr[i] = str.charAt(i) - '0';
            }
            
            int tmp = 0;
            int cnt = 0;
            for(int i=0; i<arr.length; i++){
            	if(arr[i] != tmp){
                	if(arr[i] == 1){
                    	tmp = 1;
                        cnt++;
                    } else{
                    	tmp = 0;
                        cnt++;
                    }
                }
            }
            
            System.out.println("#" + test_case + " " + cnt);
		}
	}
}