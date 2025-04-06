import java.util.*;

public class Main {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0; i<M; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            int lower = lowerBound(start);
            int upper = upperBound(end);

            System.out.println(upper - lower);
        }
    }

    public static int lowerBound(int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return left;
    }

    public static int upperBound(int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return right + 1;
    }
}