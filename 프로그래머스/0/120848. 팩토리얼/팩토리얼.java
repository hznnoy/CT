class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=10; i++){
            if(factorial(i)<=n){
                answer = i;
            }
        }   
        return answer;
    }
    
    static int factorial(int n){
        int ans = 1;
        
        for(int i=1; i<=n; i++){
            ans *=i;   
        }
        return ans;
    }
}