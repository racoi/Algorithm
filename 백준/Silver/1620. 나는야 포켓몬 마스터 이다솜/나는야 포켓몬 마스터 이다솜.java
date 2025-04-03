import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, Integer> rvsmap = new HashMap<>();

        for(int i=1; i<=N; i++){
            String name = sc.next();
            map.put(i, name);
            rvsmap.put(name, i);
        }

        for(int i=0; i<M; i++){
            if(sc.hasNextInt()){
                int key = sc.nextInt();
                System.out.println(map.get(key));
            }else{
                String value = sc.next();
                System.out.println(rvsmap.get(value));
            }
        }
    }
}