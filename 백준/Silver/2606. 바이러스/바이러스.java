import java.util.Scanner;

public class Main{

    static int[][] arr;
    static boolean[] visited;
    static int count;
    static int N;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();

        arr = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0; i<M; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            arr[num1][num2] = 1;
            arr[num2][num1] = 1;
        }

        dfs(1);
        System.out.println(count-1);
    }

    public static void dfs(int nodeIndex){
        visited[nodeIndex] = true;
        count++;

        for(int i = 0 ; i <= N; i++) {
            if(arr[nodeIndex][i] == 1 && !visited[i])
                dfs(i);
        }
    }
}