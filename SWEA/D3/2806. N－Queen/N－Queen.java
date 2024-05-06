import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int chess[];
    static int n, ans;
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            n = sc.nextInt();
            chess = new int[n];
			ans = 0;
            
            dfs(0);
            System.out.println("#" + test_case + " " + ans);
		}
	}
    
    static void dfs(int depth){
        boolean isPossible;
    	if(depth == n){
        	ans++;
            return;
        }
        for(int i=0; i<n; i++){
            isPossible = true;
            chess[depth] = i;
        	for(int j=0; j<depth; j++){
            	if(chess[j] == chess[depth] || depth - j == Math.abs(chess[depth] - chess[j])){
                	isPossible = false;
                    break;
                }
            }
            if(isPossible){
            	dfs(depth + 1);
            }
        }
    }
}