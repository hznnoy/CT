import java.io.*;
import java.util.*;

public class Solution{
	static int[] arr;
	static int n;
	static int answer;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			
			arr = new int[n];
			answer=0;
			find(0);
			
			result.append("#"+tc+" "+answer+"\n");
		}
		System.out.print(result);
	}
	
	static void find(int count){
		if(count==n) { //퀸 안겹치게 놓기 성공
			answer++;
			return;
		}
		
		for(int i=0; i<n; i++) {
			arr[count]=i; //(count,i)위치에 퀸이 있다는 뜻
			if(isPossible(count)) {
				find(count+1);
			}
		}		
	}
	
	static boolean isPossible(int count) {
		for(int j=0; j<count; j++) {
			if(arr[j]==arr[count] || arr[count]==arr[j]+(count-j) || arr[count]==arr[j]-(count-j)) {
				return false;
			}
		}
		return true;
	}
}