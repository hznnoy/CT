import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringBuilder sb = new StringBuilder();

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int max = Math.max((Math.max(a, b)), c);

            if(a==0 && b==0 && c==0) {
                System.out.print(sb);
                break;
            }

            if(max < a+b+c-max){
                if(a==b && b==c){
                    sb.append("Equilateral");
                }else if((a==b && a!=c) || (b==c && b!=a) || (a==c && a!=b)){
                    sb.append("Isosceles");
                }else if(a!=b && b!=c && a!=c){
                    sb.append("Scalene");
                }
            }else{
                sb.append("Invalid");
            }

            System.out.println(sb);

        }


    }
}