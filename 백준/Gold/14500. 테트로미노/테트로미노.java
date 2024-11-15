import java.io.*;
import java.util.*;

public class Main{
	static int n,m;
	static int[][] arr;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	static boolean[][] visit;
	static int max = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n][m];
		visit = new boolean[n][m];
		for(int i=0; i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<n;i++) {
			for(int j=0; j<m;j++) {
				visit[i][j]=true;
				cal(i,j,1,arr[i][j]);
				visit[i][j]=false;
			}
		}
		
		System.out.print(max);
	}
	
	static void cal(int r, int c, int length, int sum) {
		
		if(length==4) {
			max = Math.max(max, sum);
			return;
		}
		
		for(int j=0; j<4; j++) {
			int nr = r+dx[j];
			int nc = c+dy[j];
			if(nr>=0 && nc>=0 && nr<n && nc<m) {
				if(!visit[nr][nc]) {
					if(length==2) { // ㅗ 모양인 경우 두번째 칸일때 다시 탐색
						visit[nr][nc]=true;
						cal(r,c,length+1, sum+arr[nr][nc]);
						visit[nr][nc]=false;
					}
					visit[nr][nc]=true;
					cal(nr,nc,length+1, sum+arr[nr][nc]);
					visit[nr][nc]=false;
				}
			}
		}

		
	}

}