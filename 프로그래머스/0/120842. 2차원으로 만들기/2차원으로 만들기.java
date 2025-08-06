class Solution {
    public int[][] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[][] answer = new int[len/n][n];
        
        int idx = 0;
        for(int i=0; i<=len-n; i+=n){
            for(int j=0;j<n; j++){
                answer[idx][j] = num_list[i+j];
                
            }
            idx++;
        }
        return answer;
    }
}