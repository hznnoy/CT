class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=3; i<=n; i++){
            if(!isPrime(i)){
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isPrime(int num){
        int count=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        
        if(count<=2){
            return true;
        }else{
            return false;
        }
    }
}
