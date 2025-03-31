import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[988];
        int N = sc.nextInt();

        for(int i=123; i<=987; i++){
            String str = String.valueOf(i);

            if(str.charAt(1) == '0' || str.charAt(2) == '0') continue;
            if(str.charAt(0) == str.charAt(1) || str.charAt(1) == str.charAt(2) || str.charAt(2) == str.charAt(0)) continue;

            check[i] = true;
        }

        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            int strike = sc.nextInt();
            int ball = sc.nextInt();

            for(int j=123; j<=987; j++){
                if(!check[j]) continue;
                int ns = 0;
                int nb = 0;

                for(int n=0; n<3; n++){
                    char hyuk = Integer.toString(num).charAt(n);
                    for(int t=0; t<3; t++){
                        char ans = Integer.toString(j).charAt(t);

                        if(hyuk == ans && n == t) ns++;
                        else if(hyuk == ans && n != t) nb++;
                    }
                }

                if (ns != strike || nb != ball) check[j] = false;
            }
        }

        int cnt = 0;
        for(int i=123; i<=987; i++){
            if(check[i]) cnt++;
        }
        System.out.println(cnt);
    }
}