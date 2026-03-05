import java.util.*;
import java.io.*;

public class Main{
    static int n;
    static int[][] power;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        power = new int[n][n];
        visited = new boolean[n];
        
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++){
                power[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        calc(0,0);
        System.out.println(min);
    }
    
    static void calc(int index, int d){
        if(d == n / 2){
            diff();
            return;
        }
        
        for(int i=index; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                calc(i+1, d+1);
                visited[i] = false;                
            }
        }            
    }
    
    static void diff(){
       int start = 0;
       int link = 0;
       
       for(int i=0; i<n-1; i++){
           for(int j=i+1; j<n; j++){
               if(visited[i] == true && visited[j] == true){
                   start +=power[i][j];
                   start +=power[j][i];
               }else if(visited[i]==false && visited[j]==false){
            	   link +=power[i][j];
            	   link +=power[j][i];   
               }
           }
       }
       
       int result = Math.abs(start-link);
       
       if(result ==0){
    	   System.out.println(result);
    	   System.exit(0);
       }
       
       min = Math.min(result,min);
   }
}