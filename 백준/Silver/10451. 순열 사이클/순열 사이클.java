import java.util.*;
import java.io.*;

public class Main{
    static int N;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int t=0; t<tc; t++){
            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr = new int[N+1];
            visited = new boolean[N+1];

            int cnt = 0;

            for(int i=1; i<=N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for(int i=1; i<=N; i++){
                if(!visited[i]){
                    dfs(i);
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }

    static void dfs(int idx) {
        int next = arr[idx];

        if (!visited[next]) {
            visited[next] = true;
            dfs(next);
        }
    }
}