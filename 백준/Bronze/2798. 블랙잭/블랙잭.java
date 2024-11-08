import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int max = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            a[i]= Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n;j++){
                for(int k=j+1; k<n; k++){
                    if(a[i]+a[j]+a[k] <= m && a[i]+a[j]+a[k] > max) {
                        max = a[i] + a[j] + a[k];
                    }
                }
            }
        }
        System.out.print(max);
    }
}