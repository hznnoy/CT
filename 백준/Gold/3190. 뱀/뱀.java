import java.io.*;
import java.util.*;

public class Main {
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0}; 
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        board = new int[n+1][n+1];
        int apple = Integer.parseInt(br.readLine());
        
        for(int i=0; i < apple; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x][y] = 1;
        }

        int l = Integer.parseInt(br.readLine());
        int[] seconds = new int[10001];
        int[] dr = new int[10001];
        for(int i=0; i<l; i++){
            String[] s = br.readLine().split(" ");
            int sec = Integer.parseInt(s[0]);
            seconds[sec] = 1;
            if(s[1].equals("L")){
                dr[sec] = -1;
            }else {
                dr[sec] = +1;
            }
        }

        int curX = 1;
        int curY = 1;
        int curD = 1; 
        int time = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{1,1});
        board[curX][curY]= 3;
        while(true){
           if(seconds[time] == 1){
               if(dr[time] == -1){ 
                   curD = ((curD -1 + 4) % 4) ;
               } else { 
                   curD = ((curD +1) % 4);
               }
           }
           int nextX = curX + dx[curD];
           int nextY = curY + dy[curD];
           time++;

           if(nextX <=0 || nextX >n || nextY <=0 || nextY >n ){
               break;
           }
           if(board[nextX][nextY] == 3){
               break;
           }

           if(board[nextX][nextY] != 1) { 
               if (!queue.isEmpty()) {
                   int[] tail = queue.poll();
                   board[tail[0]][tail[1]] = 0;
               }
           }
           queue.add(new int[]{nextX, nextY});
           board[nextX][nextY] = 3;
           curX = nextX;
           curY = nextY;
       }
        System.out.println(time);
    }
}