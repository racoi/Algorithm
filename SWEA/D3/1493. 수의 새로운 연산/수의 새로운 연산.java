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
            int p = sc.nextInt();
            int q = sc.nextInt();

            int sum1 = 0;
            int x1 = 0;
            int y1 = 0;
            for(int i=1; ; i++){
                sum1 += i;
                if(sum1 >= p){ // i번째 대각선 위치
                    x1 = i - (sum1 - p);
                    y1 = (i + 1) - x1; // x+y=i+1
                    break;
                }
            }

            int sum2 = 0;
            int x2 = 0;
            int y2 = 0;
            for(int i=1; ; i++){
                sum2 += i;
                if(sum2 >= q){ // i번째 대각선 위치
                    x2 = i - (sum2 - q);
                    y2 = (i + 1) - x2; // x+y=i+1
                    break;
                }
            }

            int sum3 = 1;
            int x3 = x1 + x2;
            int y3 = y1 + y2;
            for(int i=1; i<(x3+y3)-1; i++){ //대각선의 꼭대기 값 (1,x3+y3-1)
                sum3 += i;
            }
            int result = sum3 + (x3 - 1);

            System.out.println("#" + test_case + " " + result);
        }
    }
}