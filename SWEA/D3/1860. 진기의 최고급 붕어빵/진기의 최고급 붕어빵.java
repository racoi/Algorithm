import java.util.Scanner;
import java.util.PriorityQueue;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            PriorityQueue<Integer> q = new PriorityQueue<>();

            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            for(int i=0; i<N; i++){
                q.offer(sc.nextInt());
            }

            boolean flag = true;

            if(q.peek() < M){
                flag = false;
                q.clear();
            }

            int n = 0; //현재 붕어빵 개수
            int s = 0; //현재 흐른 시간

            while(!q.isEmpty()){
                s += M;
                n += K;
                while(q.peek() < s+M){
                    q.poll();
                    n--;
                    if(q.isEmpty()) break;
                }
                if(n < 0){
                    flag = false;
                    break;
                }
            }

            System.out.print("#" + test_case);
            if(flag){
                System.out.println(" Possible");
            } else{
                System.out.println(" Impossible");
            }
        }
    }
}