import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        int k = sc.nextInt();

        for(int i=0; i<N; i+=N/k){
            list.subList(i, i + N / k).sort(Integer::compareTo);
        }

        for(int i : list){
            System.out.print(i + " ");
        }
    }
}