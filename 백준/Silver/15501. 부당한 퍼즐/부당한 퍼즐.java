import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] in = new int[N];
        for(int i=0; i<N; i++) in[i] = sc.nextInt();
        int[] out = new int[N];
        for(int i=0; i<N; i++) out[i] = sc.nextInt();

        for(int i=0; i<N; i++){
            if(in[0] != out[i]) continue;

            boolean flag = true;
            for(int j=0; j<N; j++){
                if(in[j] != out[(i+j)%N]){
                    flag = false;
                    break;
                }
            }

            boolean rvsflag = true;
            for(int j=0; j<N; j++){
                if(in[j] != out[(i-j+N)%N]){
                    rvsflag = false;
                    break;
                }
            }

            if(flag || rvsflag) System.out.println("good puzzle");
            else System.out.println("bad puzzle");
        }
    }
}