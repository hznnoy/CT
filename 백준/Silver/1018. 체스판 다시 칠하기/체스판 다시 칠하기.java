import java.util.*;
import java.io.*;

public class Main {
	public static int min = 64;
	public static boolean[][] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				if(s.charAt(j)=='W') {
					arr[i][j] = true; 
				}else {
					arr[i][j] = false; 
				}
			}
		}
		
		for(int i=0; i<n-7; i++) {
			for(int j=0; j<m-7; j++) {
				bf(i,j);
			}
		}
		System.out.print(min);
	}
	
	static void bf(int a, int b) {
		int cnt = 0;
		boolean check = arr[a][b]; //시작 칸 색깔 체크
		
		for(int i=a; i<a+8; i++) {
			for(int j=b; j<b+8; j++) {
				if(arr[i][j]!=check) {
					cnt++;
				}
				check = !(check);
			}
			check = !(check);
		}
		cnt = Math.min(cnt, 64-cnt);
		
		if(min>cnt) {
			min = cnt;
		}
	}
}
