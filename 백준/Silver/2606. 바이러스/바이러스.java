import java.io.*;
import java.util.*;

public class Main{
	static int n,m;
	static int cnt = 0;
	
	static int[][] arr;
	static boolean[] check; 

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		arr = new int[n+1][n+1];
		
		for(int i=0; i<m;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b]=arr[b][a]=1;
		}
		
		check = new boolean[n+1];
		dfs(1);
		System.out.print(cnt);
	}
	
	static void dfs(int v) {
		check[v]=true;
		
		for(int i=2; i<=n; i++) {
			if(check[i]==false && arr[v][i]==1) {
				cnt++;
				dfs(i);
			}
		}
		
	}
}