import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] a = new int[N];
        int temp=0;
        
        for(int k=0; k<N; k++){
            a[k] = k+1;
        }
        
        for(int k=0; k<M; k++){
            st = new StringTokenizer(br.readLine()," ");
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            while(i<j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        
        for(int k=0; k<a.length; k++){
            System.out.print(a[k]+" ");
        }
    }
}