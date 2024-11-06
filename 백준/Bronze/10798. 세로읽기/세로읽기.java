import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] a = new char[5][15];
        int max = 0;
        
        for(int i=0; i<5; i++){
            String s = br.readLine();
            if(s.length()>max){
                max = s.length();
            }
            for(int j=0; j<s.length(); j++){
                a[i][j] = s.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder(); 
        for(int i=0; i<max; i++){
            for(int j=0; j<5; j++){
                if(a[j][i]=='\0'){
                    continue;
                }
                sb.append(a[j][i]);
            }
        }
        System.out.print(sb);
    } 
}