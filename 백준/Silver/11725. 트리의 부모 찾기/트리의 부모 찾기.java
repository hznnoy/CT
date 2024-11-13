import java.io.*;
import java.util.*;

public class Main{
	static ArrayList<Integer> arr[];
	static boolean[] check;
	static int n;
	static int[] parent;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[n+1];
		check = new boolean[n+1];
		
		for(int i=0; i<n+1; i++) { // 그래프 초기화
			arr[i] = new ArrayList<>();
		}
		
		for(int i=0; i<n-1; i++) { //그래프에 연결 노드 정보 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}
		
		parent = new int[n+1];
		
		dfs(1);
		
		for(int i=2; i<parent.length; i++) {
			sb.append(parent[i]+"\n");
		}
		System.out.print(sb);
	}
	
	static void dfs(int start) {
		check[start]=true;
		for(int i:arr[start]) {
			if(!check[i]) {
				parent[i]=start;
				dfs(i);
			}
		}
	}
}