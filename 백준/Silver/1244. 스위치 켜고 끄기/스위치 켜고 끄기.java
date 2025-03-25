import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }

        int s = sc.nextInt();
        for(int i=0; i<s; i++){
            int gender = sc.nextInt();
            int num = sc.nextInt();

            if(gender == 1){
                for(int j=1; j<=n; j++){
                    if(j % num == 0) arr[j] = arr[j] == 0 ? 1 : 0;
                }
            }else{
                arr[num] = arr[num] == 0 ? 1 : 0;
                for(int j=1; j<n/2; j++){
                    if(num-j < 1 || num+j >= n+1) break;
                    if(arr[num-j] == arr[num+j]){
                        arr[num-j] = arr[num-j] == 0 ? 1 : 0;
                        arr[num+j] = arr[num+j] == 0 ? 1 : 0;
                    }else break;
                }
            }
        }

        for(int i=1; i<=n; i++){
            System.out.print(arr[i] + " ");
            if(i % 20 == 0) System.out.println();
        }
    }
}