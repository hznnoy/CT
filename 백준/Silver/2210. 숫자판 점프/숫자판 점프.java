import java.io.*;
import java.util.*;

public class Main{
	static int[][] arr;
	static int[] st;
	static Set<String> set;
	static int[] dx = {-1,0,0,1};
	static int[] dy = {0,-1,1,0};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr = new int[5][5];
		set = new HashSet<String>();
		st = new int[6];
		
		for(int i=0; i<5; i++) { //배열에 입력값 넣기
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0; i<5; i++) { 
			for(int j=0; j<5; j++) {
				move(i,j,0);
			}
		}
		System.out.print(set.size());
	}
	
	static void move(int x, int y, int count) {
		if(count==6) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<6; i++) {
				sb.append(st[i]);
			}
			set.add(sb.toString()); //set은 중복 허용하지 않으므로 자동으로 걸러줌
			return;
		}
		
		for(int i=0; i<4; i++) {
			int cx = x+dx[i];
			int cy = y+dy[i];
			if(cx>=0 && cy>=0 && cx<5&& cy<5) {
				st[count]=arr[cx][cy];
				move(cx,cy,count+1);
				
			}
		}
	}
}