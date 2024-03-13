import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[9][9];
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int max = 0;
        int max_x = 1;
        int max_y = 1;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    max_y = i+1;
                    max_x = j+1;
                }
            }
        }
        
        System.out.println(max);
        System.out.println(max_y + " " + max_x);
    }
}