import java.util.*;
import java.io.*;

public class Main{
    static int[][] map;
    static int n;
    static Queue<int[]> queue = new LinkedList<>();
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static ArrayList<Integer> count = new ArrayList<>();
    static int houses=0, house=0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new boolean[n][n];
        for(int i=0; i<n; i++){
            String line = br.readLine();
            for(int j=0; j<n; j++){
                map[i][j] = line.charAt(j)-'0';
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                if (map[i][j]==1 && !visited[i][j]){
                    house=1;
                    bfs(i,j);
                    houses++;
                    count.add(house);
                }
            }
        }

        Collections.sort(count);

        System.out.println(houses);
        for(int i:count){
            System.out.println(i);
        }
    }

    static void bfs(int x, int y){
        queue.add(new int[] {x,y});
        visited[x][y]=true;
        int nx=0, ny = 0;

        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int cx = temp[0];
            int cy = temp[1];

            for(int i=0; i<4; i++){
                nx = cx+ dx[i];
                ny = cy+ dy[i];
                if(nx>=0 && ny>=0 && nx<n && ny<n){
                    if(!visited[nx][ny] && map[nx][ny]==1){
                        visited[nx][ny]=true;
                        house++;
                        queue.add(new int[] {nx,ny});
                    }

                }
            }
        }
    }
}