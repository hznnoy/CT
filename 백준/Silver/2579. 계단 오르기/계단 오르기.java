import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] stairs = new int[n+10];
        int[] dp = new int[n+10];

        for(int i=1; i<n+1; i++){
            stairs[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = stairs[1];
        dp[2] = stairs[2] + dp[1];

        for(int i=3; i<n+1; i++){
            dp[i] = Math.max(dp[i-3]+stairs[i-1], dp[i-2]) + stairs[i];
        }

        System.out.println(String.valueOf(dp[n]));
    }
}