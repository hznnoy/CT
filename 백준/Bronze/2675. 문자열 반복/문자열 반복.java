import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int k=0; k<T; k++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int R = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            
            for(int i=0; i<s.length(); i++){
                for(int j=0; j<R; j++){
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
    }
}