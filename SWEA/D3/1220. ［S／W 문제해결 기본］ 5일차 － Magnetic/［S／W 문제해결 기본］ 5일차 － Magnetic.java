import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Stack;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sc.nextInt();
            int[][] arr = new int[100][100];
            
            for(int i=0; i<100; i++){
            	for(int j=0; j<100; j++){
                	arr[i][j] = sc.nextInt();
                }
            }
            
            int cnt = 0;
            for(int i=0; i<100; i++){
            	for(int j=0; j<100; j++){
                	if(arr[j][i] != 0){
                    	stack.push(arr[j][i]);
                    }
                }
                while(!stack.isEmpty()){
                	int tmp = stack.pop();
                    if(stack.isEmpty()) break;
                    if(tmp == 2 && tmp != stack.peek()){
                    	cnt++;
                    }
                }
            }
            
            System.out.println("#" + test_case + " " + cnt);
		}
	}
}