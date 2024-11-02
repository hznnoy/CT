import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        
        for(int i=0; i<N; i++){
            A[i]=i+1;
        }
        
        for(int j=0; j<M; j++){
            st = new StringTokenizer(br.readLine()," ");
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int B = A[I-1];
            A[I-1]= A[J-1];
            A[J-1] = B;
        }
        
        for (int k=0; k<A.length; k++){
            System.out.print(A[k]+ " ");
        }
    }
}