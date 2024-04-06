import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        
        int tmp = 0;
        for(int i=0; i<4; i++){
            for(int j=i+1; j<5; j++){
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        int sum = 0;
        int mid = 0;
        for(int i=0; i<5; i++){
            sum += arr[i];
        }
        
        System.out.println(sum / 5);
        System.out.println(arr[2]);
    }
}