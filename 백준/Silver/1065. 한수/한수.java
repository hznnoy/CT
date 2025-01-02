import java.util.*;
import java.io.*;

class Main{
	 public static void main(String args[]) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());

		 if(n<100) { //100 이하의 수는 모두 한수
			 System.out.print(n);
		 }else {
			 int cnt = 99;
			 for(int i=100; i<=n; i++) {
				 int first = i/100;
				 int second = (i%100)/10;
				 int third = (i%100)%10;
				 
				 if(Math.abs(first-second)==Math.abs(second-third) && ((first<=second && second<=third) || (first>=second && second>=third))) {
					 cnt++;
				 }
			 }
			 System.out.print(cnt);
		 }
	 }
}