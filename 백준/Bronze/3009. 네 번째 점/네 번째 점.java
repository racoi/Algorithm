import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] point1 = { sc.nextInt(), sc.nextInt()};
        int[] point2 = { sc.nextInt(), sc.nextInt()};
        int[] point3 = { sc.nextInt(), sc.nextInt()};
        
        int x = 0;
        int y = 0;
        
        if(point1[0] == point2[0]) x = point3[0];
        else if(point1[0] == point3[0]) x = point2[0];
        else x = point1[0];
        
        if(point1[1] == point2[1]) y = point3[1];
        else if(point1[1] == point3[1]) y = point2[1];
        else y = point1[1];
        
        System.out.println(x + " " + y);
    }
}