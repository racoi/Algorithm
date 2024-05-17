import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int N;
    static char[][] map;
    static final int DIRECTION_X[] = {1,0,1,1};
    static final int DIRECTION_Y[] = {0,1,-1,1};

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            N = sc.nextInt();
            map = new char[N][N];

            for(int i = 0; i < N; i++){
                String str = sc.next();
                for(int j = 0; j < N; j++){
                    map[i][j] = str.charAt(j);
                }
            }

            System.out.println("#" + test_case + " " + solve());
        }
    }

    static String solve(){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] == 'o'){
                    for(int k=0; k<4; k++){
                        boolean result = check(i, j, k);
                        if(result){
                    		return "YES";
                        }
                    }
                }
            }
        }
        return "NO";
    }

    static boolean check(int y, int x, int direction){
        for(int i=0; i<4; i++){
            x += DIRECTION_X[direction];
            y += DIRECTION_Y[direction];

            if(x<0 || y<0 || x>=N || y>=N){
                return false;
            }
            if(map[y][x] != 'o'){
                return false;
            }
        }
        return true;
    }
}