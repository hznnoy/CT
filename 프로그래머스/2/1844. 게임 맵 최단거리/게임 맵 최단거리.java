import java.util.*;

class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];

        int answer = bfs(maps, visited, n, m);
        
        return answer;
    }
    
    static int bfs(int[][] maps, boolean[][] visited, int n, int m){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int [] {0,0,1});
        visited[0][0]=true;
        
        while(!q.isEmpty()){
            int[] newPoint = q.poll();
            int x = newPoint[0];
            int y = newPoint[1];
            int count = newPoint[2];

            if(x==n-1 && y==m-1){
                return count;
            }
            
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
            
                if(nx>=0 && nx<n && ny>=0 && ny<m){
                    if(maps[nx][ny]==1 && !visited[nx][ny]){
                        visited[nx][ny]=true;
                        q.offer(new int [] {nx, ny, count+1});
                    }
                }
            }
        }
        return -1;
    }
}
