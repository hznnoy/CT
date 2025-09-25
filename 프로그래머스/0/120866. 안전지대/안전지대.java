class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int danger = 0;
        int n = board.length;
        boolean[][] check= new boolean[n][n];
        int[] dx = {-1,1,0,0,-1,-1,1,1}; // 상,하,좌,우,좌상,좌하,우상,우하
        int[] dy = {0,0,-1,1,-1,1,-1,1};
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    check[i][j] = true;
                    danger++;
                    for(int k=0; k<8; k++){
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if(nx>=0 && nx<n && ny>=0 && ny<n && !check[nx][ny] && board[nx][ny]!=1){
                            check[nx][ny] = true;
                            danger++;
                        }
                    }
                }
            }
        }
        answer = n*n - danger;
        return answer;
    }
}