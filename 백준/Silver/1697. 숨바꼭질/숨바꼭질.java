import java.io.*;
import java.util.*;

public class Main{
	static Queue <Integer> q;
	static int n,k;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		if(n==k) {
			System.out.print(0); //예외(처음부터 위치가 같은 경우)
		}else {
			bfs(n);
		}

	}
	
	static void bfs(int n) {
		q = new LinkedList<>();
		q.add(n);
		int visited[] = new int[100001]; //트리의 깊이와 같은 역할
		visited[n]=1;
		
		while(!q.isEmpty()) {
			int num = q.poll();
			
			for(int i=0; i<3; i++) {
				int next;

				if(i==0) {
					next = num+1;
				}else if(i==1) {
					next = num-1;
				}else {
					next = num*2;
				}
				
				if(next==k) {
					System.out.print(visited[num]);
					return;
				}
				if(next<0 || next>100000) continue; //노드가 범위 밖이면 스킵
				if(visited[next]!=0)continue; //이미 방문한 노드라면 스킵
				
				q.add(next);
				visited[next]= visited[num]+1; 
			}
		}
	
	}
}