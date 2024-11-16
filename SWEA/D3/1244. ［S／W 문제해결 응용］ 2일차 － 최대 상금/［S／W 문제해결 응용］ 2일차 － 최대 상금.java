import java.io.*;
import java.util.*;

public class Solution{
	static char[] arr;
	static int count;
	static String money;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String inputS = st.nextToken();
			count = Integer.parseInt(st.nextToken());
			arr = inputS.toCharArray();
			
			money ="";
			exchange(0,0);
					
			result.append("#"+tc+" "+money+"\n");
		}	
		System.out.print(result);
	}
	
	static void exchange(int a, int cnt) {
		
		if(cnt==count) {
			String current = new String(arr);
			if(current.compareTo(money)>0) {
				money = current;
			}
			return;
		}
		

		for(int i=a; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				change(i,j);
				exchange(i,cnt+1);
				change(i,j); //i와 j 교환한 경우에 대한 최댓값(current)저장해뒀으므로 다시 초기화해 for문으로 다음 경우 시작
			}
		}
	}
	
	static void change(int i, int j) {
		char temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}