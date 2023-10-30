import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double[] s_card = {4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0};
	    String[] r_card = {"A+","A0","B+","B0","C+","C0","D+","D0","F"};
        
        double grade = 0;
        double tmp = 0;
        double total = 0;
        double totalCredit = 0;
        double result = 0;
        for(int i=0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String rank = st.nextToken();
            
            for(int j=0; j<s_card.length; j++) {
				if(rank.equals(r_card[j])) {
					grade = s_card[j];
					tmp = credit * grade;
					total += tmp;
					totalCredit += credit;
					result = total / totalCredit;
				}
				if(rank.equals("P")) {
					continue;
				}
			}
        }
        br.close();
        System.out.printf("%.6f", result);
    }
}