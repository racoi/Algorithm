import java.util.*;

public class Main {
    static int[][] arr;
    static int a = 0, b = 0, c = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solve(0, 0, N);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void solve(int x, int y, int size) {
        if(check(x, y, size)) {
            if(arr[x][y] == -1) a++;
            if(arr[x][y] == 0) b++;
            if(arr[x][y] == 1) c++;
            return;
        }
        int newSize = size / 3;
        for(int i=x; i<x+size; i+=newSize){
            for(int j=y; j<y+size; j+=newSize){
                solve(i, j, newSize);
            }
        }
    }

    public static boolean check(int x, int y, int size) {
        for(int i=x; i<x+size; i++){
            for(int j=y; j<y+size; j++){
                if(arr[x][y] != arr[i][j]) return false;
            }
        }
        return true;
    }
}