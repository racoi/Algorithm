import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<N; i++){
            list.add(arr[i] - arr[i - 1]);
        }
        Collections.sort(list);
        
        int result = 0;
        for(int i=0; i<N-K; i++){
            result += list.get(i);
        }
        System.out.println(result);
    }
}