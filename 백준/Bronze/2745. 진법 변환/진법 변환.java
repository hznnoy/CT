import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int result = 0;
        int a = 1;

        for (int i=n.length()-1; i>=0; i--){
            char c = n.charAt(i);
            if(c>='A' && c<='Z'){
                result += ((c-'A')+10) * a;
            }else{
                result += (c-'0') * a;
            }
            a*=b;
        }

        System.out.print(result);
    }
}