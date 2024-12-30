import java.util.*;
import java.io.*;

class Main{
	 public static void main(String args[]) throws IOException{
		 boolean[] s = new boolean[20000];
		 
		 for(int i=1; i<10000; i++) {
			 int sum = i;
			 int num = i;
			 while(num>0) {
				 sum+=num%10;
				 num=num/10;
			 }
			 s[sum]=true;
			 
			 if(s[i]==false) {
				 System.out.println(i);
			 }
		 }
	 }
}