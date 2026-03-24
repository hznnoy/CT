import java.util.*;
import java.io.*;

public class Main{
    static int N;
    static int[][] arr;
    static int cnt;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        cnt = 0;

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,1, 0);
        System.out.print(cnt);
    }
    
    static void dfs(int r, int c, int status){
        if(r == N-1 && c == N-1){
            cnt++;
            return;
        }

        if (status == 0) {
            if(c + 1 < N && arr[r][c+1] == 0){
                dfs(r, c+1, 0);
            }
        } else if(status == 1){
            if(r + 1 < N && arr[r+1][c] == 0){
                dfs(r+1, c, 1);
            }
        } else if(status == 2){
            if(c + 1 < N && arr[r][c+1] == 0){
                dfs(r, c+1, 0);
            }
            if(r + 1 < N && arr[r+1][c] == 0){
                dfs(r+1, c, 1);
            }
        }

        if(r + 1 < N && c + 1 < N && arr[r][c+1] == 0 && arr[r+1][c] == 0 && arr[r+1][c+1] == 0){
            dfs(r+1, c+1, 2);
        }

    }
}