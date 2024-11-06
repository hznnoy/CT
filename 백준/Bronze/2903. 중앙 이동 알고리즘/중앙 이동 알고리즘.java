import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 2;
        for(int i=0; i<n; i++){
            result += Math.pow(2,i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(result*result);
        System.out.print(sb);

    }
}