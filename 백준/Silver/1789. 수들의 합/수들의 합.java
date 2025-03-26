import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();

        long sum = 0;
        int num = 0;
        while(true){
            if(sum > S) break;
            sum += num + 1;
            num++;
        }
        System.out.println(num - 1);
    }
}