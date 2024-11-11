import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=1; tc<=T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            Double[] ts = new Double[n];
            String[] es = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
            double k_score=0;
            
            for(int i=0; i<n; i++) { // 총점 배열에 넣기
            	st = new StringTokenizer(br.readLine());
            	int m = Integer.parseInt(st.nextToken());
            	int f = Integer.parseInt(st.nextToken());
            	int w = Integer.parseInt(st.nextToken());
            	ts[i] = (m*0.35) + (f*0.45) + (w*0.2); 
            	if(i==k-1) {
            		k_score = ts[i];
            	}
            }
        	Arrays.sort(ts, Collections.reverseOrder());
        	int index=-1;
            for(int i=0; i<n; i++) {
            	if(ts[i]==k_score) {
            		index=i;
            	}
            }
            sb.append("#"+tc+" ");
            sb.append(es[(index)/(n/10)]+"\n");
        }
        System.out.print(sb);
	}
}
