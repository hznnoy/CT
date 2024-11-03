import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] a = new int[26];
        
        for(int i=0; i<26; i++){
            a[i]=-1;
        }        
        
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(a[c-'a']==-1){
                a[c-'a']=i;
            }
        }
        
        for(int i=0; i<26; i++){
            System.out.print(a[i]+" ");
        }    
    }
}


