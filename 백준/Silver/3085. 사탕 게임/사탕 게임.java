import java.io.*;
import java.util.*;

public class Main{
	static char[][] arr;
	static int n;
	static int countmax=0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
				
		arr = new char[n][n];

		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<n; j++) {
				arr[i][j]= s.charAt(j);
			}
		}
		countmax=0;
		
		//좌우교환
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if(arr[i][j]!=arr[i][j+1]) {
					swap(i,j,i,j+1);
					search();
					swap(i,j,i,j+1); //원상복구
				}
				
			}
		}
		//상하교환
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j]!=arr[i+1][j]) {
					swap(i,j,i+1,j);
					search();
					swap(i,j,i+1,j); //원상복구
				}
				
			}
		}
		System.out.print(countmax);
	}
	
	static void swap(int a, int b, int c, int d) {
		char temp = arr[a][b];
		arr[a][b] = arr[c][d];
		arr[c][d] = temp;
	}

	
	static void search() {
		
		for(int i=0; i<n; i++) { //행 검사
			int countw=1;

			for(int j=0; j<n-1;j++)
			if(arr[i][j]==arr[i][j+1]) {
				countw++;
				countmax = Math.max(countw, countmax);
			}else {
				countw=1;
			}
		}
		
		for(int i=0; i<n; i++) { //열 검사
			int counth=1;

			for(int j=0; j<n-1;j++)
			if(arr[j][i]==arr[j+1][i]) {
				counth++;
				countmax = Math.max(counth, countmax);
			}else {
				counth=1;
			}
		}

	}
}

