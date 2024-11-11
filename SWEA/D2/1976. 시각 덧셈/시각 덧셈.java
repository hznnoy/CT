import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=1; tc<=T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int h,m;

            if(h1+h2>=12){
                h=h1+h2-12;
            }else{
                h=h1+h2;
            }

            if(m1+m2>=60){
                m=m1+m2-60;
                h++;
            }else{
                m=m1+m2;
            }
            sb.append("#"+tc+" "+h+" "+m+"\n");
        }
        System.out.print(sb);
    }
}