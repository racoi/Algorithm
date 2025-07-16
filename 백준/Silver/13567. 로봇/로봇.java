import java.util.*;

public class Main{
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int n = sc.nextInt();

        int x = 0;
        int y = 0;
        int dir = 0;

        for(int i=0; i<n; i++){
            String command = sc.next();
            int num = sc.nextInt();

            if(command.equals("TURN")){
                if(num == 1) dir = (dir + 1) % 4;
                else dir = (dir + 3) % 4;
            }else{ // MOVE
                x += num * dx[dir];
                y += num * dy[dir];

                if(x<0 || x>M || y<0 || y>M){
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(x + " " + y);
    }
}