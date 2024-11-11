
import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=1; tc<=T; tc++) {
            int n = Integer.parseInt(br.readLine());
            int sum = 1;
            
            for(int i=2; i<=n; i++) {
            	if(i%2==0) { //짝수일떄
            		sum-=i;
            	}else if (i%2!=0) { //홀수일때
            		sum+=i;
            	}
            }
            		
            sb.append("#"+tc+" "+sum+"\n");
        }
        System.out.print(sb);
	}
}
