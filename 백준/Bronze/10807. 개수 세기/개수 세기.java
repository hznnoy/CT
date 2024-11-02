import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] agrs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int count=0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        
        int v = Integer.parseInt(br.readLine());
        
        for(int j=0;j<N;j++){
            if(arr[j]==v){
                count+=1;
            }
        }
        System.out.println(count);
    }
}