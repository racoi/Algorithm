import java.util.*;

public class Main {
    static int[][] arr = new int[9][9];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        dfs(0, 0);
    }

    public static void dfs(int row, int col){
        if(row == 9){
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        if(col == 9){
            dfs(row + 1, 0);
            return;
        }

        if(arr[row][col] == 0){
            for(int i=1; i<=9; i++){
                if(isPossible(row, col, i)){
                    arr[row][col] = i;
                    dfs(row, col + 1);
                }
            }
            arr[row][col] = 0;
            return;
        }

        dfs(row, col + 1);
    }

    public static boolean isPossible(int row, int col, int num){
        for(int i=0; i<9; i++){
            if(arr[row][i] == num) return false;
        }

        for(int i=0; i<9; i++){
            if(arr[i][col] == num) return false;
        }

        int row3 = (row / 3) * 3;
        int col3 = (col / 3) * 3;
        for(int i=row3; i<row3+3; i++){
            for(int j=col3; j<col3+3; j++){
                if(arr[i][j] == num) return false;
            }
        }

        return true;
    }
}