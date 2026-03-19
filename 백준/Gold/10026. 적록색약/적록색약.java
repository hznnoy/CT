import java.util.*;
import java.io.*;

public class Main{
    static char[][] arr;
    static boolean[][] visited;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int N;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        visited = new boolean[N][N];
        int cntA=0;
        int cntB=0;

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for(int j=0; j<N; j++){
                arr[i][j] = str.charAt(j);
            }
        }

        // 정상 경우
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]){
                    dfs(i,j);
                    cntA++;
                }
            }
        }
        visited = new boolean[N][N];
        // 적록색약인 경우
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j] == 'G') arr[i][j] = 'R';
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]){
                    dfs(i,j);
                    cntB++;
                }
            }
        }

        System.out.print(cntA + " " + cntB);
    }

    static void dfs(int x, int y){
        visited[x][y] = true;
        char color = arr[x][y];

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && nx<N && ny>=0 && ny<N && !visited[nx][ny]){
                if(arr[nx][ny] == color){
                    dfs(nx, ny);
                }
            }
        }
    }
}