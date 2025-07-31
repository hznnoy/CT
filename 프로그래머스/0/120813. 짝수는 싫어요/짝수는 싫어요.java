class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        if(n%2==0){
            int len = n/2;
            answer = new int[len];
            int idx = 0;
        
            for(int i=1; i<=n; i++){
                if(i%2!=0){
                    answer[idx++] = i;
                }
            }
        }else{
            int len = n/2;
            answer = new int[len+1];
            int idx = 0;

            for(int i=1; i<=n; i++){
                if(i%2!=0){
                    answer[idx++] = i;
                }
            }
        }
        
        return answer;
    }
}