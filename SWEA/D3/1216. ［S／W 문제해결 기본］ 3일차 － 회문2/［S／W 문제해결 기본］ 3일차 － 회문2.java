import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            int tc = sc.nextInt();

            char[][] arr = new char[100][100];
            for(int i=0; i<100; i++){
                String str = sc.next();
                for(int j=0; j<100; j++){
                    arr[i][j] = str.charAt(j);
                }
            }

            int max = 0;
            for(int start=0; start<100; start++){
                for(int end=99; end>start+max-1; end--){
                    int len = end - start + 1;

                    for(int i=0; i<100; i++){
                        boolean flag = true;
                        for(int j=0; j<len/2; j++){
                            if(arr[i][start+j] != arr[i][end-j]){
                                flag = false;
                                break;
                            }
                        }
                        if(!flag) continue;
                        if(len > max) max = len;
                    }

                    for(int i=0; i<100; i++){
                        boolean flag = true;
                        for(int j=0; j<len/2; j++){
                            if(arr[start+j][i] != arr[end-j][i]){
                                flag = false;
                                break;
                            }
                        }
                        if(!flag) continue;
                        if(len > max) max = len;
                    }
                }
            }

            System.out.println("#" + tc + " " + max);
        }
    }
}