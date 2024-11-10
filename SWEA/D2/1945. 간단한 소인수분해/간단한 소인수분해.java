import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=1; tc<=T; tc++){
            int n = Integer.parseInt(br.readLine());
            int a=0;
            int b=0;
            int c=0;
            int d=0;
            int e=0;

            while(n>1){
                if(n%2==0){
                    a++;
                    n /= 2;
                }else if(n%3==0) {
                    b++;
                    n /= 3;
                }else if (n%5==0) {
                    c++;
                    n /= 5;
                }else if(n%7==0) {
                    d++;
                    n /= 7;
                }else if(n%11==0) {
                    e++;
                    n /= 11;
                }
            }
            sb.append("#"+tc+" "+a+" "+b+" "+c+" "+d+" "+e+"\n");
        }
        System.out.print(sb);
    }
}