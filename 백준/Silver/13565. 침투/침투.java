import java.io.*;
import java.util.*;

public class Main{
	static int[][] arr;
	static int[] dx = {1,0,0,-1}; //하우좌상 순서
	static int[] dy = {0,1,-1,0};
	static int n,m;
	static boolean per;
	static boolean[][] check;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		check = new boolean[n][m];
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				arr[i][j]=s.charAt(j)-'0';
			}
		}
		for(int i=0; i<m; i++) {
			if(arr[0][i]==0 && !check[0][i]) {
				dfs(0,i);
			}
		}

		System.out.print(per ? "YES" : "NO");

	}
	
	static void dfs(int x, int y) {
		check[x][y]=true;
		if(x==n-1) {
			per=true;
			return;
		}
		
		for(int i=0; i<4; i++) {
			int cx = x+dx[i];
			int cy = y+dy[i];
			if(cx>=0 && cx<n && cy>=0 && cy<m) {
				if(arr[cx][cy]==0 && !check[cx][cy]) {					
					dfs(cx,cy);
				}
			}
		}
		
	}
}