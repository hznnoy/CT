import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] x = {0,1,0,-1};
        int[] y = {1,0,-1,0};
        StringBuilder sb = new StringBuilder();

        for(int tc=1; tc<=T; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[][] a = new int[n][n];
            int d = 0; // 방향 배열 인덱스
            int r = 0, c = 0; // 시작 좌표
            int cnt = 1;
            while(cnt<=n*n){
                a[r][c] = cnt;
                if(r+x[d]>=n || r+x[d]<0 || c+y[d]>=n || c+y[d]<0 || a[r+x[d]][c+y[d]]!=0){
                    d = (d+1)%4; // 방향전환
                }
                r+=x[d];
                c+=y[d];
                cnt++;
            }
            sb.append("#"+tc+" "+"\n");
            for(int i=0; i<n;i++){  // 배열 출력
                for(int j=0; j<n; j++){
                    sb.append(a[i][j]+ " ");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}