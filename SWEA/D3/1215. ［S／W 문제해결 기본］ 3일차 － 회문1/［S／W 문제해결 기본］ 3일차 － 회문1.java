import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int n = sc.nextInt();
            char[][] arr = new char[8][8];
            
            for(int i=0; i<8; i++){
                String str = sc.next();
            	for(int j=0; j<8; j++){
                	arr[i][j] = str.charAt(j);
                }
            }
            
            int cnt = 0;
            boolean flag = true;
            
            for(int i=0; i<8; i++){
            	for(int j=0; j<9-n; j++){
                    flag = true;
                    for(int h=0; h<n/2; h++){
                    	if(arr[i][j+h] != arr[i][j+n-1-h]){
                        	flag = false;
                        }
                    }
                    if(flag){
                    	cnt++;
                    }
                    
                    flag = true;
                    for(int h=0; h<n/2; h++){
                    	if(arr[j+h][i] != arr[j+n-1-h][i]){
                        	flag = false;
                        }
                    }
                    if(flag){
                    	cnt++;
                    }
                }
            }
            
            System.out.println("#" + test_case + " " + cnt);
		}
	}
}