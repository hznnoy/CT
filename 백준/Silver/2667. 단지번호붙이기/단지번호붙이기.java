import java.util.*;
import java.io.*;

public class Main{
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int[] apart;
    static boolean[][] visited;
    static Queue<int[]> q;
    static int [][] arr;
    static int N;
    static int apartNum = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];
        q = new LinkedList<>();

        apart = new int[N*N];

        for(int i=0; i<N; i++){
            String line= br.readLine();
            for(int j=0; j<N; j++){
                arr[i][j] = line.charAt(j) - '0';
            }
        }


        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j]==1 && !visited[i][j]) {
                    apartNum++;
                    bfs(i,j);
                }
            }
        }

        Arrays.sort(apart);
        System.out.println(apartNum);

        for(int i=0; i<apart.length; i++){
            if(apart[i]==0){
                continue;
            }else{
                System.out.println(apart[i]);
            }
        }

    }

    static void bfs(int x, int y){
        q.add(new int[] {x,y});
        visited[x][y] = true;
        apart[apartNum]++;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();

            for(int i=0; i<4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx>=0 && ny>=0 && nx<N && ny<N && !visited[nx][ny] && arr[nx][ny]==1){
                    q.add(new int[] {nx, ny});
                    visited[nx][ny] = true;
                    apart[apartNum]++;
                }
            }
        }
    }
}