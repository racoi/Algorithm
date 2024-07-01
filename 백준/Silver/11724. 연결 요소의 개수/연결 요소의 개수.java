import java.util.Scanner;

public class Main{
    static int N, M, count;
    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0; i<M; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            arr[num1][num2] = arr[num2][num1] = 1;
        }

        for(int i=1; i<=N; i++){
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void dfs(int nodeIndex){
        visited[nodeIndex] = true;

        for(int i=1; i<=N; i++){
            if(!visited[i] && arr[nodeIndex][i]==1){
                dfs(i);
            }
        }
    }
}