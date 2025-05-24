
import java.util.*;
import java.io.*;

class Main {
	static int n,m;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		
		arr = new int[m];
				
		p(0);
		System.out.print(sb);
	}
	
	static void p(int pick) {
		if(pick==m) {
			for(int i:arr) {
				sb.append(i+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<=n; i++) {
			arr[pick]=i;
			p(pick+1);
		}
	}
}
