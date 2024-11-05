import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] a = new int[9][9];
        int max = -1;    
        int n = 1;
        int m = 1;
        
        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<9; j++){
                a[i][j] = Integer.parseInt(st.nextToken());
                if(max<a[i][j]){
                    max=a[i][j];
                    n=i+1;
                    m=j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(n+" "+m);
    }
}
