/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
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
            int M = sc.nextInt();
            
            int[] a = new int[N];
            int[] b = new int[M];
            
            for(int i=0; i<N; i++){
                a[i] = sc.nextInt();
            }
            for(int i=0; i<M; i++){
                b[i] = sc.nextInt();
            }
            
            int result = 0;
            int max = 0;
            if(N < M){
            	for(int i=0; i<M-N+1; i++){
                	for(int j=0; j<N; j++){
                    	result += a[j] * b[i+j];
                	}
                	if(result > max) max = result;
                    result = 0;
            	}
            }
            else if(N > M){
                for(int i=0; i<N-M+1; i++){
                	for(int j=0; j<M; j++){
                    	result += a[i+j] * b[j];
                	}
                	if(result > max) max = result;
                    result = 0;
            	}
            }
            else {
                for(int i=0; i<N; i++){
                    result += a[i] + b[i];
                }
                max = result;
            }
            
            System.out.println("#" + test_case + " " + max);
		}
	}
}