import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int[] alpha = new int[26];
        
        for(int i=0; i<str.length(); i++){
            int countNum = str.charAt(i) - 'A';
            alpha[countNum]++;
        }
        
        int max = -1;
        char result = '?';
        for(int i=0; i<26; i++){
            if(alpha[i] > max){
                max = alpha[i];
                result = (char)(i + 'A');
            } else if (alpha[i] == max){
                result = '?';
            }
        }
        System.out.println(result);
    }
}