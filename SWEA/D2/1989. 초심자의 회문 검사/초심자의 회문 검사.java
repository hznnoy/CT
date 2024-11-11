import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=1; tc<=T; tc++) {
            String s = br.readLine();
            StringBuilder sbr = new StringBuilder();
            sbr.append(s);
            String revS = sbr.reverse().toString();
            
            sb.append("#"+tc+" ");
            if(s.equals(revS)) {
            	sb.append("1\n");
            }else {
            	sb.append("0\n");
            }
        }
        System.out.print(sb);
	}
}
