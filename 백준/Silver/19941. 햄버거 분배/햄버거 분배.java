import java.util.*;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	char[] arr = new char[N];
    	boolean[] visited = new boolean[N];
        String str = sc.next();
    	for(int i=0; i<N; i++){
            arr[i] = str.charAt(i);
        }

        int ans = 0;
    	for(int i=0; i<N; i++) {
    		if(arr[i] == 'P') {
    			for(int j=-K; j<=K; j++) {
    				if(i+j >= N) break;
    				if(i+j < 0) continue;
    				
    				if(arr[i+j] == 'H' && visited[i+j] == false) {
    					visited[i+j] = true;
    					ans++;
    					break;
    				}
    			}
    		}
    	}
    	
    	System.out.println(ans);
    }
 
    
}