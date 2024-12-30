import java.util.*;
import java.io.*;

class Main{
	 public static void main(String args[]) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int[] n = new int[9];
		 int sum = 0;
		 for(int i=0; i<9; i++) {
			 n[i]=Integer.parseInt(br.readLine());
			 sum+=n[i];
		 }
		 for(int i=0; i<8; i++) {
			 for(int j=i+1; j<9; j++) {
				 if(sum-n[i]-n[j]==100) {
					 n[i]=0;
					 n[j]=0;
					 Arrays.sort(n);
				 
					 for(int k=2;k<9;k++) {
						 System.out.println(n[k]);
					 }
					 return;
				 }			 
			 }
		 }

	 }
}