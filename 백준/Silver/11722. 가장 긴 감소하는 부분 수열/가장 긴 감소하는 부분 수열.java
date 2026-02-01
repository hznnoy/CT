import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] board  = new int[n+1];
        int[] dp = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            board[i] = Integer.parseInt(st.nextToken());
        }

        dp[n] = 1;
        int res = 1;
        for (int i=n-1; i>=1; --i) {
            dp[i] = 1;
            for (int j = n; j > i; --j) {
                if(board[i] > board[j] && dp[i] <= dp[j]){
                    dp[i] += 1;
                }
            }
            res = Math.max(res , dp[i]);
        }
        System.out.println(res);
    }
}