class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean visit[] = new boolean[n]; // 방문 여부 확인 용도
        
        for(int i=0; i<n; i++){
            if(!visit[i]){
                dfs(i, computers, visit);
                answer++; 
            }
        }
        return answer;
    }
    
    static void dfs(int i, int[][]computers, boolean[]visit){
        visit[i]=true;
        for(int j=0; j<computers.length; j++){
            if(i!=j && !visit[j] && computers[i][j]==1){
                dfs(j, computers, visit); // 재귀
            }
        }
    }
}