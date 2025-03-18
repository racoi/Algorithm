import java.util.*;

public class Main {
    static int[][] arr = new int[9][9];
    static boolean flag;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<9; i++){
            String str = sc.next();
            for(int j=0; j<9; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        dfs(0);

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void dfs(int depth){
        if(depth == 81){
            flag = true;
            return;
        }

        int row = depth / 9;
        int col = depth % 9;

        if(arr[row][col] != 0) dfs(depth + 1);
        else{
            for(int i=1; i<=9; i++){
                if(!isValid(row, col, i)) continue;
                arr[row][col] = i;
                dfs(depth + 1);

                if(flag) return;
                arr[row][col] = 0;
            }
        }
    }

    public static boolean isValid(int row, int col, int num){
        for(int i=0; i<9; i++){
            if(arr[i][col] == num || arr[row][i] == num) return false;
        }

        int row3 = row / 3 * 3;
        int col3 = col / 3 * 3;
        for(int i=row3; i<row3+3; i++){
            for(int j=col3; j<col3+3; j++){
                if(arr[i][j] == num) return false;
            }
        }
        return true;
    }
}