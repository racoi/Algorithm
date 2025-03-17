import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] pack = new int[M];
        int[] each = new int[M];
        for(int i=0; i<M; i++){
            pack[i] = sc.nextInt();
            each[i] = sc.nextInt();
        }

        Arrays.sort(pack);
        Arrays.sort(each);

        int min = Math.min(Math.min(((N/6)+1)*pack[0], N*each[0]), (N/6)*pack[0]+(N%6)*each[0]);
        System.out.println(min);
    }
}