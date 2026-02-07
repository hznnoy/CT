import java.util.*;
import java.io.*;

public class Main{
    static int dp[][];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        dp = new int[30][30];
        
        for(int tc=0; tc<T; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(combi(b,a));
        }
    }
    
    static int combi(int n, int r){
        if(dp[n][r] != 0){
            return dp[n][r];
        }
        if(n == r || r == 0){
            return dp[n][r] = 1;
        }
        return dp[n][r] = combi(n-1,r-1) + combi(n-1,r);
    }
}