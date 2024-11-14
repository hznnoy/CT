
import java.io.*;
import java.util.*;

public class Main{
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int[][] arr;
	static boolean[][] visit;
	static int m,n;
	static int count; //영역 넓이 카운트
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int x1,x2,y1,y2;
		arr = new int[m][n];
		visit = new boolean[m][n];
		int w,h;
		
		for(int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			
			w = x2-x1-1;
			h = y2-y1-1;
			for(int j=0;j<=h;j++) {
				for(int l=0;l<=w;l++) {
					arr[m-y2+j][x1+l]=1; //arr배열에 입력받은 좌표로 사각형 부분 1로 설정
				} 
			}			
		}
		int num=0; //영역 개수
		List<Integer> s = new ArrayList<>();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j]==0 && !visit[i][j]) {
					count=0;
					num++;
					dfs(i,j);
					s.add(count);
				}
			}
		}
		Collections.sort(s);
		
		StringBuilder sb = new StringBuilder();
		sb.append(num+"\n");
		for(int i=0; i<s.size(); i++) {
			sb.append(s.get(i)+" ");
		}
		System.out.print(sb);
	}
	
	static void dfs(int x, int y) {
		visit[x][y]=true;
		count++;
		for(int i=0; i<4; i++) {
			int cx = x+dx[i];
			int cy = y+dy[i];
			if(cx>=0 && cy>=0 && cx<m && cy<n) {
				if(!visit[cx][cy] && arr[cx][cy]==0) {
					dfs(cx,cy);
				}
			}
		}
	}
}