import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        for(int i=0; i<N; i++){
            String str = br.readLine();
            boolean[] arr = new boolean[26];
            boolean check = true;
            
            for(int j=0; j<str.length(); j++){
                int ch = str.charAt(j) - 'a';
                if(arr[ch]) {
                    if(str.charAt(j) != str.charAt(j - 1)){
                        check = false;
                        break;
                    }
                } else {
                    arr[ch] = true;
                }
            }
            if(check){
                count++;
            }
        }
        br.close();
        System.out.println(count);
    }
}