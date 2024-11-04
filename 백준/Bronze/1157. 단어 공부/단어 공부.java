import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] a = new int[26];
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                a[c-65]++;
            }else{
                a[c-97]++;
            }
        }
        
        char ch = '?';
        int max = -1;
        
        for(int i=0; i<a.length; i++){
            if(max<a[i]){
                max = a[i];
                ch = (char)(i+65);
            }else if(max==a[i]){
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
