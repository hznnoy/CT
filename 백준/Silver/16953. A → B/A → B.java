import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int count = 1;

        while(b!=a){
            if(b<a){
                System.out.print("-1");
                return;
            }
            String str = Integer.toString(b);

            if(str.charAt(str.length()-1)-'0' == 1){
                str = str.substring(0,str.length()-1);
                b = Integer.parseInt(str);
            }else if(b % 2 == 0){
                b /= 2;
            }else{
                System.out.print("-1");
                return;
            }
            count++;
        }

        System.out.print(count);

    }
}