import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=1; tc<=T; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[][] a = new int[n][n];
            int[][] a90 = new int[n][n];
            int[][] a180 = new int[n][n];
            int[][] a270 = new int[n][n];
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++) {
                    a[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int j=n-1; j>=0; j--){
                for(int i=0; i<n; i++){
                    a90[i][j] = a[Math.abs(j-n+1)][i];
                }
            }

            for(int j=n-1; j>=0; j--){
                for(int i=n-1; i>=0; i--) {
                    a180[j][i] = a[Math.abs(j-n+1)][Math.abs(i-n+1)];
                }
            }

            for(int j=0; j<n; j++){
                for(int i=n-1; i>=0; i--){
                    a270[i][j] = a[j][Math.abs(i-n+1)];
                }
            }

            sb.append("#"+tc+"\n");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++) {
                    sb.append(a90[i][j]);
                }
                sb.append(" ");
                for(int j=0; j<n; j++) {
                    sb.append(a180[i][j]);
                }
                sb.append(" ");
                for(int j=0; j<n; j++) {
                    sb.append(a270[i][j]);
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}