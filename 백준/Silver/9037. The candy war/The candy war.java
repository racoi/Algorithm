import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 0; tc < T; tc++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                int num = sc.nextInt();
                if(num % 2 != 0) arr[i] = ++num;
                else arr[i] = num;
            }
            boolean flag = true;
            for(int i = 1; i < N; i++){
                if(arr[i] != arr[0]){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(0);
                continue;
            }

            int cnt = 0;
            int[] tmp = new int[N];
            while(true){
                for(int i = 0; i < N; i++){
                    tmp[i] = arr[i] / 2;
                }
                for(int i = 0; i < N; i++){
                    arr[i] = arr[i] / 2 + tmp[(i - 1 + N) % N];
                }

                for(int i = 0; i < N; i++){
                    if(arr[i] % 2 != 0) arr[i]++;
                }

                cnt++;

                boolean flag2 = true;
                for(int i = 0; i < N-1; i++){
                    if(arr[i] != arr[i+1]){
                        flag2 = false;
                        break;
                    }
                }
                if(flag2) break;
            }

            System.out.println(cnt);
        }
    }
}