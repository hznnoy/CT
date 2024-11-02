import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        int max=A[0];
        int min=A[0];
        for(int j=0;j<N;j++){
            if(max<A[j]){
                max=A[j];
            }
            if(min>A[j]){
                min=A[j];
            }
        }
        System.out.print(min+" "+max);  
    }
}