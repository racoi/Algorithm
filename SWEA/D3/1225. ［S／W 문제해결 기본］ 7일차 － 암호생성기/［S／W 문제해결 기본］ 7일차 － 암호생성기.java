import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            sc.nextInt();
            for(int i=0; i<8; i++){
                q.offer(sc.nextInt());
            }

            int cnt = 1;
            while(true){
                int tmp = q.poll();
                if(tmp - cnt <= 0){
                    tmp = 0;
                    q.offer(tmp);
                    break;
                } else{
                    tmp -= cnt;
                    q.offer(tmp);
                    cnt++;
                }
                if(cnt == 6) cnt = 1;
            }

            System.out.print("#" + test_case);
            for(int i=0; i<8; i++){
                System.out.print(" " + q.poll());
            }
            System.out.println();
        }
    }
}