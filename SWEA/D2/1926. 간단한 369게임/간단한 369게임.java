import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=n; i++) {
            String s = Integer.toString(i);
            if(s.contains("3")||s.contains("6")||s.contains("9")) {
            	for(int j=0; j<s.length(); j++) {
            		if(s.charAt(j)=='3' || s.charAt(j)=='6' || s.charAt(j)=='9') {
            			sb.append("-");
            		}
            	}
            	sb.append(" ");
            }else {
            	sb.append(i+" ");
            }
        }
        System.out.print(sb);
	}
}
