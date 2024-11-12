import java.io.*;
import java.util.*;

public class Main{
	static int[] x = {-1,1,0,0};
	static int[] y = {0,0,-1,1};

	static int n,m,k;
	static int cnt = 0;
	
	static int[][] arr;
	static boolean[][] check; 
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb= new StringBuilder();
		
		for(int tc=0; tc<T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			arr = new int[m][n];
			check = new boolean[m][n];

			for(int i=0; i<k;i++) { // 배추개수만큼 
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				arr[a][b]=1;
			}
			
			cnt = 0;
			
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(arr[i][j]==1 && check[i][j]==false) {
						cnt++;				
						dfs(i,j);
					}
				}
			}
			sb.append(cnt+"\n");
		}
		System.out.print(sb);
	}
	
	static void dfs(int a, int b) {		
		check[a][b] = true;
		for(int i=0; i<4; i++) { // 방향벡터 탐색
			int next_x = a+x[i];
			int next_y = b+y[i];

			if(next_x>=0 && next_x<m && next_y>=0 && next_y<n) {
				if(arr[next_x][next_y]==1 && !check[next_x][next_y]) {
					dfs(next_x, next_y);
				}
			}
		}
	
	}

	
}