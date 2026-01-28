import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] map = new boolean[n][n];
        
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j<n; j++){
                map[i][j] = input[j].charAt(0) == '1';
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(map[j][i] & map[i][k]){
                        map[j][k] = true;
                    }
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(boolean[] contain : map){
            for(boolean b : contain){
                sb.append(b? 1 : 0).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }
}
