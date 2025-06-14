import java.util.*;

public class Main {
    static int[] arr;
    static ArrayList<Integer> list;
    static boolean[] visited;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        arr = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        list = new ArrayList<>();
        visited = new boolean[N + 1];
        for(int i = 1; i <= N; i++) {
            visited[i] = true;
            dfs(i, i);
            visited[i] = false;
        }

        Collections.sort(list);
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void dfs(int start, int target) {
        if(visited[arr[start]] == false) {
            visited[arr[start]] = true;
            dfs(arr[start], target);
            visited[arr[start]] = false;
        }
        if(arr[start] == target) list.add(target);
    }
}