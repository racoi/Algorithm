import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {1, 1, 2, 2, 2, 8};
        
        for(int i=0; i<arr.length; i++){
            int n = sc.nextInt();
            
            System.out.print(arr[i] - n + " ");
        }
        
        sc.close();
    }
}