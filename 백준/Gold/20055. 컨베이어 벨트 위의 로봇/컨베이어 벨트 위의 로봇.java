import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Stack<Integer> belt = new Stack<>();
        for(int i=0; i<N*2; i++){
            belt.add(sc.nextInt());
        }
        ArrayList<Integer> robot = new ArrayList<>();
        for(int i=0; i<N; i++){
            robot.add(0);
        }

        int cnt = 0;
        int result = 1;

        while(true){
            // 1. 벨트 이동
            belt.add(0, belt.pop());
            robot.remove(N-1);
            robot.add(0, 0);
            robot.set(N-1, 0);

            // 2. 로봇 이동
            for(int i=N-2; i>=0; i--){
                if(robot.get(i) != 0){
                    if(robot.get(i+1) == 1 || belt.get(i+1) == 0) continue;
                    robot.set(i, 0);
                    robot.set(i+1, 1);
                    belt.set(i+1, belt.get(i+1) - 1);
                    if(belt.get(i+1) == 0) cnt++;
                }
            }

            // 3. 로봇 올리기
            if(belt.get(0) != 0){
                robot.set(0, 1);
                belt.set(0, belt.get(0) - 1);
                if(belt.get(0) == 0) cnt++;
            }

            // 4. 종료 조건 검사
            if(cnt >= K) break;
            else result++;
        }
        System.out.println(result);
    }
}