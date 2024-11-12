import java.io.*;
import java.util.*;

public class Main{
	static int[][] arr;
	static boolean[] check;
	static int n,m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n+1][n+1];
		check = new boolean[n+1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			arr[u][v]=arr[v][u]=1;
		}
		int cnt = 0;
		
		for(int i=1;i<=n;i++) {
			if(check[i]==false) {
				dfs(i);
				cnt++;
			}
		}
		System.out.print(cnt);
	}
	
	static void dfs(int start) {
		check[start]=true;
		
		for(int i=1; i<=n; i++) {
			if(arr[start][i]==1 && !check[i]) {
				dfs(i);
			}
		}
	}
}