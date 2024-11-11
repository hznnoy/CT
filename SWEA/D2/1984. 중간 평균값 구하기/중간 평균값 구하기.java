import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=1; tc<=T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a= new int[10];
            for(int i=0; i<10; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);
            double sum = 0;
            for(int i=1; i<=8; i++) {
            	sum+=a[i];            
            }  
            double result = sum/8;
            sb.append("#"+tc+" "+Math.round(result)+"\n");
        }
        System.out.print(sb);
	}
}
