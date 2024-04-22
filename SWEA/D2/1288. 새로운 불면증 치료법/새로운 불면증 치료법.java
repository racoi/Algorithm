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
			int N = sc.nextInt();
            
            int cnt = 0;
            int num = 0;
            boolean[] visited = new boolean[10];
            
            while(cnt < 10){
                num += N;
                String str_num = Integer.toString(num);
                for(int i=0; i<str_num.length(); i++){
                    int number = Character.getNumericValue(str_num.charAt(i));
                	if(!visited[number]){
                    	visited[number] = true;
                        cnt++;
                    }
                }
            }
            System.out.println("#" + test_case + " " + num);
		}
	}
}