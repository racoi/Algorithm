import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int[] gu;
    static boolean[] check;
    static int[] in;
    static int[] in_card;
    static int win;
    static boolean[] isSelected;

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            gu = new int[9];
            in = new int[9];
            in_card = new int[9];
            check = new boolean[18];
            for(int i=0; i<9; i++){
                gu[i] = sc.nextInt();
                check[gu[i]-1] = true;
            }

            int idx = 0;
            for(int i=0; i<18; i++){
                if(!check[i]){
                    in_card[idx++] = i+1;
                }
            }

            isSelected = new boolean[9];
            win = 0;
            dfs(0);
            System.out.println("#" + test_case + " " + win + " " + (362880 - win));
        }
    }

    static void dfs(int cnt){
        if(cnt == 9){
            int gu_score = 0;
            int in_score = 0;
            for(int i=0; i<9; i++){
                if(gu[i] > in[i]){
                    gu_score += gu[i] + in[i];
                }
                else{
                    in_score += gu[i] + in[i];
                }
            }
            if(gu_score > in_score){
                win++;
            }
            return;
        }
        for(int i=0; i<9; i++){
            if(isSelected[i]){
                continue;
            }
            in[cnt] = in_card[i];
            isSelected[i] = true;
            dfs(cnt + 1);
            isSelected[i] = false;
        }
    }
}