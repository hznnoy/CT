import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while(n!=0){
            if(n % b>=10 && n % b<=35){
                sb.append((char) ((n % b)-10+'A'));
            }else{
                sb.append(n % b);
            }
            n /= b;
        }
        System.out.print(sb.reverse().toString());
    }
}