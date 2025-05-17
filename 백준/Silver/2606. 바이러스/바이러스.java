import java.util.*;
import java.io.*;

public class Main{
    static int computer;
    static int count=0;

    static boolean[] visited;
    static boolean[][] graph;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computer = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        visited = new boolean[computer+1];
        graph = new boolean[computer+1][computer+1];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y]=graph[y][x]=true;
        }

        dfs(1);
        System.out.print(count);
    }

    static void dfs(int start){
        visited[start]=true;

        for(int i=1;i<=computer;i++) {
            if(!visited[i] && graph[start][i]){
                count++;
                dfs(i);
            }
        }
    }
}
