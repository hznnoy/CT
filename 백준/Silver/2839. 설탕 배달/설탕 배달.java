import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min =5000;
		int cnt = 0;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if(3*i+5*j == n) {
					cnt++;
					min = Math.min(i+j, min);
				}
			}
		}
		if(cnt==0) {
			System.out.print("-1");			
		}else {
			System.out.print(min);
		}
	}
}
