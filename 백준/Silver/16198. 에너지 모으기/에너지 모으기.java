import java.util.*;

public class Main {
    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        dfs(list, 0);
        System.out.println(max);
    }

    public static void dfs(List<Integer> list, int sum){
        if(list.size() == 2){
            max = Math.max(max, sum);
            return;
        }
        for(int i=1; i<list.size()-1; i++){
            int x = list.get(i);
            int tmp = list.get(i-1) * list.get(i+1);
            list.remove(i);
            dfs(list, sum + tmp);
            list.add(i, x);
        }
    }
}