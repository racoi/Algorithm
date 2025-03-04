import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if(n % 5 == 0 || n % 5 == 2) System.out.println("CY");
        else System.out.println("SK");
    }
}