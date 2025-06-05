import java.io.*;
import java.util.*;

public class Main {
	static int N, M;
	static char[][] arr;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
        
		arr = new char[N][M];
		for(int i=0; i<N; i++){
			arr[i] = br.readLine().toCharArray();
		}
        
        int x = 0;
		int y = 0;
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				if (arr[i][j] == 'I'){
					x = i;
					y = j;
					arr[i][j] = 'X';
					break;
				}
			}
		}
        
        cnt = 0;
        bfs(x, y);

		System.out.println(cnt==0 ? "TT" : cnt);

	}

	public static void bfs(int x, int y){
		Queue<int []> q = new LinkedList<>();
		q.add(new int[] {x, y});

		while (q.size() > 0){
			int[] poll = q.poll();
			x = poll[0];
			y = poll[1];

			for(int i=0; i<4; i++){
				int nx = x + dx[i];
				int ny = y + dy[i];
				if((nx>=0 && nx<N && ny>=0 && ny<M) && arr[nx][ny]!='X'){
					if (arr[nx][ny] == 'P'){
						cnt++;
					}
					arr[nx][ny] = 'X';
					q.add(new int[] {nx, ny});
				}
			}
		}
	}

}