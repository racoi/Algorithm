import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 나무의 수
        int M = sc.nextInt(); // 가져갈 길이
        int[] arr = new int[N];

        int min = 0;
        int max = 0;
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

//        for(int h=max-1; h>=0; h--){
//            int sum = 0;
//            for(int j=0; j<N; j++){
//                if(arr[j] > h){
//                    sum += arr[j] - h;
//                }
//                System.out.println(sum);
//            }
//            if(sum >= M){
//                System.out.println(h);
//                return;
//            }
//        }

        while(min < max){ // upper bound
            int mid = (min + max) / 2;
            long sum = 0; // 나무 길이 최대 10억
            for(int i : arr){
                if(i > mid){
                    sum += i - mid;
                }
            }
            if(sum < M){ // 필요한 길이보다 짧다 -> 절단기 높이를 낮춰서 더 많은 길이를 잘라야 함.
                max = mid;
            } else{ // 필요한 길이보다 길다 -> 최대값을 찾기 위해 절단기 높이를 높임.
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}