import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();

        for(int i=1; i<=N; i++){
            q.offer(i);
        }

        System.out.print("<");
        int cnt = 1;
        while(q.size() != 1){
            if(cnt == K){
                System.out.print(q.poll() + ", ");
                cnt = 1;
            } else{
                q.offer(q.poll());
                cnt++;
            }
        }
        System.out.print(q.poll() + ">");
    }
}