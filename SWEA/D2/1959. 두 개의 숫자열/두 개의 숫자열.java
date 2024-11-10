import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=1; tc<=T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] A = new int[n];
            int[] B = new int[m];

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++){
                B[i] = Integer.parseInt(st.nextToken());
            }
            int max = 0;
            if(n>m){
                for(int j=0; j<n-m+1; j++){
                    int sum = 0;
                    for(int i=0; i<m; i++){
                        sum += A[i+j]*B[i];
                    }
                    if(max<sum){
                        max = sum;
                    }
                }
            }else{
                for(int j=0; j<m-n+1; j++){
                    int sum = 0;
                    for(int i=0; i<n; i++){
                        sum += A[i]*B[i+j];
                    }
                    if(max<sum){
                        max = sum;
                    }
                }
            }
            sb.append("#"+tc+" "+max+"\n");
        }
        System.out.print(sb);
    }
}