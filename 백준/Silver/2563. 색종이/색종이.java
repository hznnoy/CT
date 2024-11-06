import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] a = new boolean[100][100];
        int count=0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j=x; j<=x+9; j++){
                for(int k=y; k<=y+9; k++){
                    if(a[j][k]==false){
                        a[j][k] = true;
                        count++;
                    }
                }
            }
        }
        
        System.out.print(count);
    }
}