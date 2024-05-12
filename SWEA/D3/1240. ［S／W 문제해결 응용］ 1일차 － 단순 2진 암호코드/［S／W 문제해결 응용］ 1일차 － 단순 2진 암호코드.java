import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] bits = {"0001101", "0011001", "0010011", "0111101",
                "0100011", "0110001", "0101111", "0111011", "0110111", "0001011"};

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] num = new int[8];

            String code = "";
            for(int i=0; i<N; i++){
                String s = sc.next();
                if(code.isEmpty()){
                    for(int j=M-1; j>=0; j--){
                        if(s.charAt(j) == '1'){
                            code = s.substring(j-55, j+1);
                            break;
                        }
                    }
                }
            }

            int idx = 0;
            for(int i=0; i<code.length(); i+=7){
                String tmp = code.substring(i, i+7);
                for(int j=0; j< bits.length; j++) {
                    if (tmp.equals(bits[j])){
                        num[idx++] = j;
                        break;
                    }
                }
            }

            int sum = 0;
            int total = 0;
            for(int i=0; i<8; i++){
                if(i % 2 == 0){ //홀수 자리
                    sum += num[i];
                }else{
                    total += num[i];
                }
            }
            total += sum * 3;

            int result = 0;
            if(total % 10 == 0){
                for(int i=0; i<8; i++) {
                    result += num[i];
                }
            }

            System.out.println("#"+test_case+" "+result);
        }
    }
}