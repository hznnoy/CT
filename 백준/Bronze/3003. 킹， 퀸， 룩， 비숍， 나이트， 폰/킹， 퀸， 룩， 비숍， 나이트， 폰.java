import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int[] a = {1,1,2,2,2,8};
                
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<a.length; i++){
            int value = Integer.parseInt(st.nextToken());
            sb.append(a[i]-value).append(" ");
        }
        System.out.print(sb);
    }
}
