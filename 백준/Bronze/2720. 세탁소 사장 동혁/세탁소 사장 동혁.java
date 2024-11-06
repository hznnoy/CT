import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<T; i++){
            int c = Integer.parseInt(br.readLine());
            int q = c / 25;
            int d = (c % 25) / 10;
            int n = ((c % 25) % 10) / 5;
            int p = ((c % 25) % 10) % 5;
            sb.append(q+" "+d+" "+n+" "+p+"\n");
        }
        System.out.print(sb);
    }
}