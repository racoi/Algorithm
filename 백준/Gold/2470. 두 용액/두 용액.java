import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        int num1 = 0;
        int num2 = 0;
        int left = 0;
        int right = N - 1;
        int min = Integer.MAX_VALUE;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(min > Math.abs(sum)){
                min = Math.abs(sum);

                num1 = arr[left];
                num2 = arr[right];

                if(sum == 0) break;
            }
            if(sum < 0) left++;
            else right--;
        }

        System.out.println(num1 + " " + num2);
    }
}