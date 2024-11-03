import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        String a = st.nextToken();
        String b = st.nextToken();
        int revA = ((a.charAt(2)-'0')*100)+((a.charAt(1)-'0')*10)+(a.charAt(0)-'0');
        int revB = ((b.charAt(2)-'0')*100)+((b.charAt(1)-'0')*10)+(b.charAt(0)-'0');

        if(revA>revB){
            System.out.print(revA);
        }else{
            System.out.print(revB);
        }     
    }
}