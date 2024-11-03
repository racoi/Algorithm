import java.util.Scanner;

public class Main {
    static int N;
    static int[] number;
    static int[] operator = new int[4];
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        number = new int[N];
        for (int i = 0; i < N; i++) {
            number[i] = sc.nextInt();
        }

        for(int i=0; i<4; i++){
            operator[i] = sc.nextInt();
        }

        dfs(1, number[0]);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void dfs(int depth, int num) {
        if(depth == N){
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }
        for(int i=0; i<4; i++){
            if(operator[i] > 0){
                operator[i]--;

                switch(i){
                    case 0: dfs(depth + 1, num + number[depth]);    break;
                    case 1: dfs(depth + 1, num - number[depth]);    break;
                    case 2: dfs(depth + 1, num * number[depth]);    break;
                    case 3: dfs(depth + 1, num / number[depth]);    break;
                }
                
                operator[i]++;
            }
        }
    }
}