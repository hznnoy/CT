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
            int cnt = 0;
            int[][] a = new int[n][n];
            for(int i=0; i<n; i++) {// 배열에 입력 값(퍼즐 모양) 넣기
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++) {
                    a[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            for(int i=0; i<n; i++) { // 가로 확인
            	int temp = 0;
                for(int j=0; j<n; j++) {
                	if(a[i][j]==0) {
                		if(temp==k) {
                			cnt++;
                			temp=0;
                		}else {
                			temp=0;
                		}
                	}else {
                		temp++;
                	}
                }     
                if(temp==k) {
                	cnt++;
                }
            }
            for(int i=0; i<n; i++) { // 세로 확인
            	int temp = 0;
                for(int j=0; j<n; j++) {
                	if(a[j][i]==0) {
                		if(temp==k) {
                			cnt++;
                			temp=0;
                		}else {
                    		temp=0;
                		}
                	}else {
                		temp++;
                	}
                }   
                if(temp==k) {
                	cnt++;
                }
            }

            sb.append("#"+tc+" "+cnt+"\n");
        }
        System.out.print(sb);
	}
}
