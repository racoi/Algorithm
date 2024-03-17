import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int B = sc.nextInt();
        
        int tmp = 0;
        String result = "";
        
        while(N > 0){
            tmp = N % B;
            if(tmp >= 10){
                char ch = (char)(tmp + 55);
                result += ch;
            } else{
                result += tmp;
            }
            N = N / B;
        }
        for(int i=result.length()-1; i>=0; i--){
            System.out.print(result.charAt(i));
        }
        
        //System.out.println(Integer.toString(N, B).toUpperCase());
    }
}