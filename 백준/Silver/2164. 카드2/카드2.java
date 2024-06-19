import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            q.offer(i);
        }

        while(q.size() != 1){
            q.poll();
            int num = q.poll();
            q.offer(num);
        }

        System.out.println(q.poll());
    }
}