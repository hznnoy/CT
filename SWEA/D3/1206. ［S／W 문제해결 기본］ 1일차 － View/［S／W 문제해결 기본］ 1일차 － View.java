import java.io.*;
import java.util.*;

public class Solution{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		
		for(int tc=1; tc<=10; tc++) {
			int n = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] a = new int[n];
			for(int i=0; i<n; i++) {
				a[i]= Integer.parseInt(st.nextToken());
			}
			
			int sum=0;
			for(int i=2; i<n-2;i++) {
				int left = Math.max(a[i-1],a[i-2]);
				int right = Math.max(a[i+2], a[i+1]);
				if(left<a[i] && right<a[i]) {
					sum+=a[i]-Math.max(left, right);
				}
			}
			result.append("#"+tc+" "+sum+"\n");
			
		}
		System.out.print(result);
	}
	
}