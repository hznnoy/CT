import java.io.*;
import java.util.*;

public class Main{
	static int n,m,k;
	static int count = 0;
	static int[][] arr;
	static boolean[][] visit;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		arr = new int[n][m];
		visit = new boolean[n][m];
		
		for(int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr[r-1][c-1]=1;
		}
		
		int max = 0;
		for(int i=0; i<n;i++) {
			for(int j=0; j<m;j++) {
				if(arr[i][j]==1 && !visit[i][j]) {
					count=0;
					find(i,j);
					max = Math.max(count, max);
				}
			}
		}
		System.out.print(max);
	}
	
	static void find(int r, int c) {
		visit[r][c]=true;
		count++;
		
		for(int i=0; i<4; i++) {
			int nr = r+dx[i];
			int nc = c+dy[i];
			if(nr>=0 && nc>=0 && nr<n && nc<m) {
				if(arr[nr][nc]==1 && !visit[nr][nc]) {
					find(nr,nc);
				}
			}
		}
	}
}