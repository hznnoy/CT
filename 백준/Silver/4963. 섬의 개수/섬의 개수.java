import java.io.*;
import java.util.*;

public class Main{
	static int[] dx = {-1,-1,-1,0,0,1,1,1};
	static int[] dy = {-1,0,1,-1,1,-1,0,1};
	static int[][] arr;
	static boolean[][] check;
	static int n,m;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());

			if(n==0 && m==0) {
				break;
			}else if(n==1 && m==1) {
				if(Integer.parseInt(br.readLine())==0) {
					sb.append("0\n");
				}else {
					sb.append("1\n");
				}
			}else {
				arr = new int[m][n];
				check = new boolean[m][n];
				
				for(int i=0; i<m; i++) {  //배열에 지도 입력 
					st = new StringTokenizer(br.readLine());
					for(int j=0; j<n;j++) {
						arr[i][j]=Integer.parseInt(st.nextToken());
					}
				}
				
				int cnt = 0;
				
				for(int i=0;i<m;i++) {
					for(int j=0; j<n;j++) {
						if(arr[i][j]==1 && !check[i][j]) {
							bfs(i,j);
							cnt++;
						}
					}
				}
				sb.append(cnt+"\n");
			}
		}
		System.out.print(sb);

	}
	
	static void bfs(int a, int b) {
		Queue<int[]> q= new LinkedList<>();
		q.add(new int[] {a,b});
		
		check[a][b]=true;
		
		while(!q.isEmpty()) {
			int[] node = q.poll();
			
			for(int i=0; i<8; i++) {
				int cx = node[0]+dx[i];
				int cy = node[1]+dy[i];
				
				if(cx>=0 && cx<m && cy>=0 && cy<n) {
					if(arr[cx][cy]==1 && !check[cx][cy]) {
						q.add(new int[] {cx,cy});
						check[cx][cy]=true;
					}
				}
			}
			
		}
		
	}
}