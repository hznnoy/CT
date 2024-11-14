import java.io.*;
import java.util.*;

public class Main{
	static int n;
	static int[][] arr;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static boolean[][] visit;
	static int count; // 단지 내 아파트 수
	static int total = 0; // 단지 수
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visit = new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<n; j++) {
				arr[i][j] = s.charAt(j)-'0';
			}
		}
		
		List<Integer> counthouse = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j]==1 && !visit[i][j]) {
					count=0;
					total++;
					find(i,j);
					counthouse.add(count);
				}
			}
		}
		System.out.println(total);
		Collections.sort(counthouse);
		
		for(int i=0; i<counthouse.size();i++) {
			System.out.println(counthouse.get(i));
		}
	}
	
	static void find(int x,int y) {
		visit[x][y] = true;
		count++;
		
		for(int i=0;i<4;i++) {
			int cx = x+dx[i];
			int cy = y+dy[i];
			if(cx>=0 && cy>=0 && cx<n && cy<n) {
				if(visit[cx][cy]==false && arr[cx][cy]==1) {				
					find(cx,cy);	
				}
			}
		}
	}
}