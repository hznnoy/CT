import java.io.*;
import java.util.*;

public class Main{
	static int n;
	static int[] sw;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		sw = new int[n+1];
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		for(int i=1; i<=n; i++) {
			sw[i] = Integer.parseInt(st.nextToken());
		}
		
		int student = Integer.parseInt(br.readLine());
		for(int i=0; i<student; i++) {
			st =new StringTokenizer(br.readLine());
			int gen = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			turn(gen, num);
		}
		
		for(int i=1; i<=n; i++) {
			System.out.print(sw[i]+" ");
			if(i%20==0) {
				System.out.print("\n");
			}
		}
	}
	
	static void turn(int gen, int num) {
		if(gen==1) { //남학생
			for(int i=1; i<=n; i++) {
				if(i%num==0) {
					sw[i]=change(sw[i]); // 스위치 상태 변경
				}
			}
		}else {//여학생
			for(int i=1; i<=n; i++) {
				if(num-i>=1 && num+i<=n) {
					if(sw[num-i]==sw[num+i]) {
						sw[num-i]=change(sw[num-i]);
						sw[num+i]=change(sw[num+i]);
					}else {
						sw[num]=change(sw[num]); //좌우 다르면 자기자신만 바꾸기
						break;
					}
				}else {
					sw[num]=change(sw[num]);
					break;
				}
			}
		}
	}
	static int change(int status) {
		if(status==1) {
			return 0;
		}else {
			return 1;
		}
	}
}

