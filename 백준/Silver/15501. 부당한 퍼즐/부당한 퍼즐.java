import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        int[] input = new int[N];
        StringTokenizer st = new StringTokenizer(in.readLine());
        StringBuilder inputStr = new StringBuilder();
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
            inputStr.append(input[i]).append(" ");
        }

        int[] output = new int[N];
        st = new StringTokenizer(in.readLine());
        StringBuilder outputStr = new StringBuilder();
        for (int i = 0; i < N; i++) {
            output[i] = Integer.parseInt(st.nextToken());
            outputStr.append(output[i]).append(" ");
        }

        // 정방향 회전 비교용 문자열
        String out = outputStr.toString();
        String doubled = out + out;

        // 역방향 회전 문자열 생성
        StringBuilder reversed = new StringBuilder();
        for (int i = N - 1; i >= 0; i--) {
            reversed.append(output[i]).append(" ");
        }
        String reversedDoubled = reversed.toString() + reversed.toString();

        // 포함 여부 확인
        if (doubled.contains(inputStr.toString()) || reversedDoubled.contains(inputStr.toString())) {
            System.out.println("good puzzle");
        } else {
            System.out.println("bad puzzle");
        }
    }
}