import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=1; tc<=T; tc++) {
        	int n = Integer.parseInt(br.readLine());
        	int[][] a = new int[n][n];
        	sb.append("#"+tc+"\n");
        	
        	for(int i=0; i<n; i++) {
            	for(int j=0; j<=i; j++) {
	        		if(j==0){
	        			a[i][j]=1;       			
	        		}else if(i==j){
	        			a[i][j]=1;       			
	        		}else {
	        			a[i][j]=a[i-1][j-1]+a[i-1][j];
	        		}
            	}
        	} 
        	
        	for(int i=0; i<n; i++) {
            	for(int j=0; j<=i; j++) {
	        		sb.append(a[i][j]+" ");
            	}
            	sb.append("\n");
        	}
        }
        System.out.print(sb);
	}
}
