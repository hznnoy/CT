import java.io.*;
import java.util.*;

public class Solution{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[n][n];
			
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				for(int j=0; j<n; j++) {
					arr[i][j]=s.charAt(j)-'0';
				}
			}
			int sum = 0;
			
			for(int i=0; i<n; i++) {
				sum+=arr[i][n/2]; //가운데줄 쭉 저장
			}
			
			for(int i=1; i<=n/2; i++) {  //나머지 좌우로 나누어 저장
				for(int j=i; j<n-i; j++) {
					int left = (n/2)-i;
					int right = (n/2)+i;
					sum+=arr[j][left];
					sum+=arr[j][right];
				}
			}
			result.append("#"+tc+" "+sum+"\n");
			
		}
		System.out.print(result);
	}
	
}