import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            
            if(arr[2]==0) break;
            
            Arrays.sort(arr);
            
            if(arr[2] < arr[0] + arr[1]){
                if(arr[0]==arr[1] && arr[0]==arr[2]){
                    System.out.println("Equilateral");
                }
                else if(arr[0]==arr[1] || arr[0]==arr[2] || arr[1]==arr[2]){
                    System.out.println("Isosceles");
                } else{
                    System.out.println("Scalene");
                }
            } else{
                System.out.println("Invalid");
            }
        }
    }
}