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
            int m = Integer.parseInt(st.nextToken());
            int[][] a = new int[n][n];
            
            for(int i=0; i<n; i++) {  //배열에 값 넣기
            	st = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++) {
                	a[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int sum;
            int max = 0;
            for(int i=0; i<=n-m; i++) {
                for(int j=0; j<=n-m; j++) {
                	sum=0;
                	for(int k=0; k<m; k++) {  // m*m 파리채 속 숫자 합하기
                    	for(int l=0; l<m; l++) {
                    		sum+=a[k+i][l+j];
                    	}
                	}
                	if(max<sum) {
                		max=sum;
                	}
                }
            }
            sb.append("#"+tc+" "+max+"\n");   
        }
        System.out.print(sb);
	}
}
