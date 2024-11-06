import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int sum = 1;
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(n + " = 1");

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    sb.append(" + " + i);
                }
            }

            if (sum==n) {
                System.out.println(sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}