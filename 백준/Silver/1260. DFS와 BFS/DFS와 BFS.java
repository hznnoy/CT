import java.util.*;
import java.io.*;

public class Main {
	static boolean[] check;
	static StringBuilder sb = new StringBuilder();
	static int[][] arr;
	static Queue<Integer> q = new LinkedList<>();
	
	static int n,m,v;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		arr = new int[n+1][n+1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b]=arr[b][a]=1;
		}
		
		check = new boolean[n+1]; 
		dfs(v);
		sb.append("\n");
		
		check = new boolean[n+1]; //초기화 
		bfs(v);
		
		System.out.print(sb);
	}
	
	static void dfs(int v) {
		// 자기 자신 데이터 출력
		check[v] = true;
		sb.append(v+" ");
		
		// 자식 노드 재귀 호출   
		for(int i=0; i<=n; i++) {
			if(check[i]==false && arr[v][i]==1 ) {
				dfs(i);
			}
		}		
	}
	
	static void bfs(int v) {
		//큐에 자기 자신 넣기 + 출력
		q.add(v);
		check[v] = true;

		while(!q.isEmpty()) {
			int start = q.poll();
			sb.append(start+" ");
			//큐에 자식노드 넣기
			for(int i=1; i<=n; i++) {
				if(check[i]==false && arr[start][i]==1) {
					q.add(i);
					check[i]=true;
				}
			}
		}
	}
}
