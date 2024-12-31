import java.util.*;

public class Main {
    static int[][] map;
    static int N,M;
    static ArrayList<int[]> chicken = new ArrayList<>();
    static ArrayList<int[]> house = new ArrayList<>();
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j] = sc.nextInt();
                if(map[i][j] == 2) chicken.add(new int[]{i, j});
                else if(map[i][j] == 1) house.add(new int[]{i, j});
            }
        }
        visited = new boolean[chicken.size()];

        dfs(0, 0);
        System.out.println(min);
    }

    public static void dfs(int idx, int depth){
        if(depth == M){
            int sum = 0;
            for(int i=0; i<house.size(); i++){
                int minDist = Integer.MAX_VALUE;
                for(int j=0; j<chicken.size(); j++){
                    if(visited[j]){
                        int dist = Math.abs(house.get(i)[0] - chicken.get(j)[0]) + Math.abs(house.get(i)[1] - chicken.get(j)[1]);
                        minDist = Math.min(minDist, dist);
                    }
                }
                sum += minDist;
            }
            min = Math.min(min, sum);
            return;
        }

        for(int i=idx; i<chicken.size(); i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }
}