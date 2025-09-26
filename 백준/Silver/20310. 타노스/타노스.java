import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int oneCnt = 0, zeroCnt = 0;

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '1') oneCnt++;
            else zeroCnt++;
        }

        oneCnt /= 2;
        zeroCnt /= 2;

        char[] arr = S.toCharArray();
        boolean[] removed = new boolean[S.length()];

        for(int i=0; i<arr.length && oneCnt>0; i++){
            if(arr[i] == '1'){
                removed[i] = true;
                oneCnt--;
            }
        }

        for(int i=arr.length-1; i>=0 && zeroCnt>0; i--){
            if(arr[i] == '0'){
                removed[i] = true;
                zeroCnt--;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(!removed[i]) System.out.print(arr[i]);
        }
    }
}