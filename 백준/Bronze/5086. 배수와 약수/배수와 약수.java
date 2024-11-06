import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A > B) {
                if (A % B == 0) {
                    sb.append("multiple"+"\n");
                } else {
                    sb.append("neither"+"\n");
                }
            } else if (A < B){
                if (B % A == 0) {
                    sb.append("factor"+"\n");
                } else {
                    sb.append("neither"+"\n");
                }
            }else if (A==0 && B==0){
                System.out.print(sb);
                break;
            }
        }
    }
}