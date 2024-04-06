import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        int tmp = 0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        for(int i=0; i<N; i++){
            System.out.println(arr[i]);
        }
    }
}