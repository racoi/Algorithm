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
            int H = sc.nextInt();
            int W = sc.nextInt();

            char[][] arr = new char[H][W];

            int n = 0;
            int m = 0;

            for(int i=0; i<H; i++){
                String str = sc.next();
                for(int j=0; j<W; j++){
                    arr[i][j] = str.charAt(j);
                    if(arr[i][j] == '>' || arr[i][j] == '<' || arr[i][j] == '^' || arr[i][j] == 'v'){
                        n = i;
                        m = j;
                    }
                }
            }

            int N = sc.nextInt();
            char[] command = new char[N];

            String str_c = sc.next();
            for(int i=0; i<N; i++){
                command[i] = str_c.charAt(i);

                switch(command[i]){
                    case 'U':
                        if(n-1 >= 0){
                            if(arr[n-1][m] == '.'){
                                arr[n-1][m] = '^';
                                arr[n][m] = '.';
                                n--;
                            }else{
                                arr[n][m] = '^';
                            }
                        } else{
                            arr[n][m] = '^';
                        }
                        break;
                    case 'D':
                        if(n+1 < H){
                            if(arr[n+1][m] == '.'){
                                arr[n+1][m] = 'v';
                                arr[n][m] = '.';
                                n++;
                            } else{
                                arr[n][m] = 'v';
                            }
                        } else{
                            arr[n][m] = 'v';
                        }
                        break;
                    case 'R':
                        if(m+1 < W){
                            if(arr[n][m+1] == '.'){
                                arr[n][m+1] = '>';
                                arr[n][m] = '.';
                                m++;
                            } else{
                                arr[n][m] = '>';
                            }
                        } else{
                            arr[n][m] = '>';
                        }
                        break;
                    case 'L':
                        if(m-1 >= 0){
                            if(arr[n][m-1] == '.'){
                                arr[n][m-1] = '<';
                                arr[n][m] = '.';
                                m--;
                            } else{
                                arr[n][m] = '<';
                            }
                        } else{
                            arr[n][m] = '<';
                        }
                        break;
                    case 'S':
                        if(arr[n][m] == '^' && n-1 >= 0){
                            for(int j=n-1; j>=0; j--){
                                if(arr[j][m] == '*'){
                                    arr[j][m] = '.';
                                    break;
                                }
                                if(arr[j][m] == '#') break;
                            }
                        }
                        else if(arr[n][m] == 'v' && n+1 < H){
                            for(int j=n+1; j<H; j++){
                                if(arr[j][m] == '*'){
                                    arr[j][m] = '.';
                                    break;
                                }
                                if(arr[j][m] == '#') break;
                            }
                        }
                        else if(arr[n][m] == '>' && m+1 < W){
                            for(int j=m+1; j<W; j++){
                                if(arr[n][j] == '*'){
                                    arr[n][j] = '.';
                                    break;
                                }
                                if(arr[n][j] == '#') break;
                            }
                        }
                        else if(arr[n][m] == '<'){
                            for(int j=m-1; j>=0; j--){
                                if(arr[n][j] == '*'){
                                    arr[n][j] = '.';
                                    break;
                                }
                                if(arr[n][j] == '#') break;
                            }
                        }
                        break;
                }
            }

            System.out.print("#" + test_case + " ");
            for(int i=0; i<H; i++){
                for(int j=0; j<W; j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}