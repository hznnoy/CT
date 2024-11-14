import java.io.*;
import java.util.*;

public class Main{
	static String[] num = {"1", "2", "3"};
	static String result;
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		n = Integer.parseInt(br.readLine());
		
		bt("",0);
	}
	static void bt(String s, int length) {
		if(length==n) {
			System.out.print(s);
			System.exit(0);
			return;
		}
		
		for(int i=0; i<3; i++) {
			if(Isgood(s+num[i])==true) { //좋은수열이면
				bt(s+num[i],length+1);
			}
		}
	}
	
	static boolean Isgood(String s) { //좋은수열 여부확인
		int half = s.length()/2;
		for(int i=1; i<=half; i++) { //문자열 반 길이만큼 반복 
			if(s.substring(s.length()-i).equals(s.substring(s.length()-2*i, s.length()-i))){
				return false;
			}
		}
		return true;
	}
}