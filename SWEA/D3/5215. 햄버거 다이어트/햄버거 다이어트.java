import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int[] score, cal;
    static int N, L, max;
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
            L = sc.nextInt();
            
            score = new int[N];
            cal = new int[N];
            
            for(int i=0; i<N; i++){
            	score[i] = sc.nextInt();
                cal[i] = sc.nextInt();
            }
            
            max = 0;
            getSubSet(0, 0, 0);
            System.out.println("#" + test_case + " " + max);
		}
	}
    
    static void getSubSet(int cnt, int s_sum, int c_sum){
    	if(c_sum > L) return;
        if(cnt == N){
        	if(c_sum <= L) max = Math.max(max, s_sum);
            return;
        }
        getSubSet(cnt+1, s_sum+score[cnt], c_sum+cal[cnt]);
        getSubSet(cnt+1, s_sum, c_sum);
    }
}