import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        int max = Math.max((Math.max(a,b)),c);

        if(max==a){
            if(b + c > a){
                sb.append(a+b+c);
            }else{
                a = b + c - 1;
                sb.append(a+b+c);
            }
        }else if(max==b){
            if(a + c > b){
                sb.append(a+b+c);
            }else{
                b = a + c - 1;
                sb.append(a+b+c);
            }
        }else if(max==c){
            if(a + b > c){
                sb.append(a+b+c);
            }else{
                c = a + b - 1;
                sb.append(a+b+c);
            }
        }
        System.out.print(sb);
    }
}