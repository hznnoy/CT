import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        for(int tc=1; tc<=T; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int month1 = Integer.parseInt(st.nextToken());
            int day1 = Integer.parseInt(st.nextToken());
            int month2 = Integer.parseInt(st.nextToken());
            int day2 = Integer.parseInt(st.nextToken());

            int result = 0;

            if(month1 == month2){
                result = day2 - day1 + 1;
            }else{
                for(int i=month1; i<month2; i++){
                    result += month[i];
                }
                result += day2 - day1 + 1;
            }
            sb.append("#"+tc+" "+result+"\n");
        }
        System.out.print(sb);
    }
}