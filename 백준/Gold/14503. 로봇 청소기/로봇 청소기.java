import java.io.*;
import java.util.*;

public class Main{
	static int[] dx = {-1,0,1,0};  //북동남서
	static int[] dy = {0,1,0,-1};
	static int[][] arr;
	static int m,n;
	static int r,c,d;
	static int clean=1; // 시작점은 무조건 청소하므로 
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		arr[r][c]=2;
		
		clean(r,c,d);
		
		System.out.print(clean);
	}
	
	static void clean(int r, int c, int d) {
		if(arr[r][c]==0) {
			arr[r][c]=2;
			clean++;
		}	
		boolean flag = false;
		
		//주변 4칸 확인
		for(int i=0; i<4; i++) {
			d = (d+3) % 4;
			int nr = r+dx[d];
			int nc = c+dy[d];
			if(nr>=0 && nc>=0 && nr<n && nc<m) {
				if(arr[nr][nc]==0) { //주변 4칸 중 청소되지 않은 빈칸이 있는 경우 
					clean(nr,nc,d); //한칸 전진
					flag=true;
					break;
				}
			}
		}
		if(!flag) {
			int newd = (d+2) % 4; //반대방향으로 체크
			int nr = r+dx[newd];
			int nc = c+dy[newd];
			if(nr>=0 && nc>=0 && nr<n && nc<m) {
				if(arr[nr][nc]!=1) { // 벽이 아닌 경우 
					clean(nr,nc,d); // 바라보는 방향은 유지 								
				}
			}
		}
			
		}
	}

