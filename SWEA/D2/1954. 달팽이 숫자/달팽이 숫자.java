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
		int[] dx={0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
			int[][] arr = new int[N][N];
            
            int nx = 0, ny = 0;
            int dir = 0;
            
            for(int i=1; i<=N*N; i++){
                arr[nx][ny] = i;
                if(nx + dx[dir] >= N || nx + dx[dir] < 0 || ny + dy[dir] >= N || ny + dy[dir] < 0 || arr[nx + dx[dir]][ny + dy[dir]] != 0){
                    dir = (dir + 1) % 4; //방향전환
                }
                nx += dx[dir];
                ny += dy[dir];
            }
            
            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
				for (int n : arr[i])
					System.out.print(n + " ");
				System.out.println();
			}
		}
	}
}