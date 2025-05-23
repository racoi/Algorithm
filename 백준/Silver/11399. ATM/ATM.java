import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
 
		int sum = 0;
        int tmp = 0;
		for(int i = 0; i < N; i++) {	
			sum += tmp + arr[i];
			tmp += arr[i];
		}
		System.out.println(sum);
	}
}