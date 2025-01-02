import java.util.*;
import java.io.*;

class Main{
	 public static void main(String args[]) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());
		 int d [][] = new int[n][3]; // 두번째 칸은 몸무게 키 등수 순
		 
		 for(int i=0; i<n; i++) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 d[i][0] = Integer.parseInt(st.nextToken());
			 d[i][1] = Integer.parseInt(st.nextToken());
			 d[i][2] = 1; // 등수는 1로 초기화 
		 }
		 
		 for(int i=0; i<n-1; i++) {
			 for(int j=i+1; j<n; j++) {
				 if(d[i][0]<d[j][0] && d[i][1]<d[j][1]) { // 본인보다 덩치 큰 사람이 있는 경우 
					 d[i][2]++; // 등수+1
				 }else if(d[i][0]>d[j][0] && d[i][1]>d[j][1]) { // 다음 사람이 본인보다 덩치가 작은 경우
					 d[j][2]++; // 상대 등수+1;
				 }
			 }
			 
		 }
		 
		 for(int i=0; i<n; i++) {
			 System.out.print(d[i][2]+" ");
		 }
	 }
}