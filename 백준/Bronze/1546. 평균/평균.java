import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Double[] a = new Double[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            a[i] = Double.parseDouble(st.nextToken());
        }
        
        Arrays.sort(a);
        double sum = 0;
        
        for(int i=0;i<N;i++){
            sum += a[i]/a[a.length-1]*100;
        }
        
        System.out.print(sum/N);
        
    }
}