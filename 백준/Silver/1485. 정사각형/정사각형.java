import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=0; tc<T; tc++){
            int[][] point = new int[4][2];
            for(int i=0; i<4; i++){
                point[i][0] = sc.nextInt();
                point[i][1] = sc.nextInt();
            }
            solve(point);
        }
    }

    public static void solve(int[][] point){
        List<Double> list = new ArrayList<>();

        for(int i=0; i<4; i++){
            for(int j=0; j<i; j++){
                double dist = Math.sqrt(Math.pow((point[i][1]-point[j][1]), 2) +
                        Math.pow((point[i][0]-point[j][0]), 2));
                list.add(dist);
            }
        }
        list.sort(Comparator.reverseOrder());

        if(list.get(0).equals(list.get(1)) && list.get(2).equals(list.get(3)) &&
                list.get(2).equals(list.get(4)) && list.get(2).equals(list.get(5))){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}