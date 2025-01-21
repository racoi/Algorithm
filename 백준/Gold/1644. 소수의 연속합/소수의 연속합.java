import java.util.*;

public class Main {
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        arr.add(2);
        for(int i=3; i<=N; i++){
            isPrime(i);
        }

        int left = 0;
        int right = 0;
        int sum = 0;
        int cnt = 0;

        while(true){
            if(sum >= N) sum -= arr.get(left++);
            else if(right == arr.size()) break;
            else sum += arr.get(right++);

            if(sum == N) cnt++;
        }

        System.out.println(cnt);
    }

    public static void isPrime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0) return;
        }
        arr.add(num);
    }
}