import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[] wall = new boolean[N];
        for(int i = 0; i < M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x < y){
                for(int j = x; j < y; j++){
                    wall[j] = true;
                }
            }
        }
        int cnt = 1;
        for(int i = 1; i < N; i++){
            if(!wall[i]) cnt++;
        }
        System.out.println(cnt);
    }
}