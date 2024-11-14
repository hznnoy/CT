import java.io.*;
import java.util.*;

public class Main{
	static int[][] arr;
	static boolean[][] visit;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int max=1;
	static int h, n;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		int maxheight = 0; // 입력값중 최대높이
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j]>maxheight) {
					maxheight = arr[i][j];
				}
			}
		}
		
		int countsafe;
		
		for(h=1; h<=maxheight; h++) {
			countsafe = 0;
			visit = new boolean[n][n]; //visit 초기화

			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(arr[i][j]>h && !visit[i][j]) {
						countsafe++;
						dfs(i,j);
					}
				}
			}
			if(countsafe>max) {
				max=countsafe;
			}
		}
		
		System.out.print(max);
	}
	
	static void dfs(int x, int y) {
		visit[x][y]=true;
		
		for(int i=0; i<4; i++) {
			int cx = x+dx[i];
			int cy = y+dy[i];
			if(cx>=0 && cy>=0 && cx<n && cy<n) {
				if(arr[cx][cy]>h && !visit[cx][cy]) {
					dfs(cx,cy);
				}
			}
		}
		
		
	}
}