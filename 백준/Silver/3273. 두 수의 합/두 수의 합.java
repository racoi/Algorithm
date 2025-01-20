import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        Arrays.sort(arr);

        int result = 0;
        int sum = 0;
        int left = 0;
        int right = n - 1;

        while(left < right){
            sum = arr[left] + arr[right];

            if(sum == x) result++;
            if(sum < x) left++;
            else right--;
        }

        System.out.println(result);
    }
}