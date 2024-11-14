import java.io.*;
import java.util.*;

public class Main{
	static boolean[] check;
 	static int[] num;
 	static int n,m;
 	static StringBuilder sb= new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		num = new int[m];
		check = new boolean[n+1];
		
		pick(0);
		
		System.out.print(sb);
	}
	
	static void pick(int length) {
		if(length==m) {
			for(int i=0; i<num.length; i++) {
				sb.append(num[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<=n; i++) {
			if(!check[i]) {
				num[length]=i;
				check[i]=true;
				pick(length+1);
				
				check[i]=false; // 재귀 끝나고 돌아오면 방문여부 다시 false로 초기화
			}
		}
	}
}