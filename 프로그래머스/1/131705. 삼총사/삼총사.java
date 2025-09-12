class Solution {
    static int[] temp;
    static int answer = 0;
    
    public int solution(int[] number) {
        
        temp = number;
        dfs(0,0,0);
        
        return answer;
    }
    
    static void dfs(int first, int depth, int sum){
        if(depth==3){
            if(sum==0) {
                answer++;
            }                return; 

        }
        for(int i=first; i<temp.length; i++){
            dfs(i+1, depth+1, sum+temp[i]);
        }
    }
}