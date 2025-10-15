class Solution {
    static boolean[] visit;
    static int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        int len = dungeons.length;
        visit = new boolean[len];
        
        search(k, dungeons, 0);
        
        return answer;
    }
    
    public void search(int k, int[][] dungeons, int count){
        answer = Math.max(count, answer);
        
        for(int i=0; i<dungeons.length; i++){
            int least = dungeons[i][0];
            int decrease = dungeons[i][1];
            
            if(!visit[i] && k>=least){
                visit[i] = true;
                search(k-decrease, dungeons, count+1);
                visit[i] = false;
            }
        }
    }
}