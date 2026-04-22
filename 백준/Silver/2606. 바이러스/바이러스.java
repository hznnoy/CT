import java.util.*;
import java.io.*;

public class Main{
    static int[][] arr;
    static boolean[] visited;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int com = Integer.parseInt(br.readLine());
        int pair = Integer.parseInt(br.readLine());

        arr = new int[com+1][com+1];
        visited = new boolean[com+1];

        for(int i=0; i<pair; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(1);
        
        System.out.println(cnt);
    }

    static void dfs(int start){
        visited[start] = true;
        for(int i=1; i<arr.length; i++){
            if(arr[start][i] ==1 && !visited[i]){
                cnt++;
                dfs(i);
            }
        }
    }
}