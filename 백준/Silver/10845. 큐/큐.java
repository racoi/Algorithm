import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        int N = sc.nextInt();
        int last = -1;

        for(int i=0; i<N; i++){
            String str = sc.next();

            switch (str){
                case "push":
                    last = sc.nextInt();
                    q.offer(last);
                    break;
                case "pop":
                    if(q.isEmpty()){
                        sb.append("-1").append('\n');
                    } else{
                        sb.append(q.poll()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(q.size()).append('\n');
                    break;
                case "empty":
                    if(q.isEmpty()){
                        sb.append(1).append('\n');
                    } else{
                        sb.append(0).append('\n');
                    }
                    break;
                case "front":
                    if(q.isEmpty()){
                        sb.append(-1).append('\n');
                    } else{
                        sb.append(q.peek()).append('\n');
                    }
                    break;
                case "back":
                    if(q.isEmpty()){
                        sb.append(-1).append('\n');
                    } else{
                        sb.append(last).append('\n');
                    }
                    break;
                default:
                    break;
            }
        }
        
        System.out.println(sb);
    }
}