import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int i=666;
		while(true) {
			String s = Integer.toString(i);
			if(s.contains("666")) {
				cnt++;
			}
			
			if(n==cnt) {
				break;
			}else { 
				i++;
			}
		}
		System.out.print(i);
	}
}
