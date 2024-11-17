import java.io.*;
import java.util.*;

public class Main{
	static int p;
	static String a;
	static boolean[] check;
	static List<String> arr;
	static int count = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		a= st.nextToken();
		p= Integer.parseInt(st.nextToken());
		
		check = new boolean[1000000];
		arr = new ArrayList<>();
		
		dfs(a);
		System.out.print(count);
	}
	
	static void dfs(String a) {
		arr.add(a);
		int ia = Integer.parseInt(a);
		check[ia]=true;
	
		int sum=0;
		for(int i=0; i<a.length(); i++) {
			sum += Math.pow(a.charAt(i)-'0',p);
		}

		if(check[sum]==true) {
			for(int i=0; i<arr.indexOf(Integer.toString(sum)); i++) {
				count++;
			}
			return;
		}
		dfs(Integer.toString(sum));
	}
}
