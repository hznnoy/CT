class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer3 = 0, denom3 =0;
        
        denom3 = denom1 * denom2;
        numer1 *= denom2;
        numer2 *= denom1;
        numer3 = numer1 + numer2; 
            
        int val =0;
        
        //약분 
        for(int i=1; i<=numer3 && i<=denom3; i++){
            if(numer3%i==0 && denom3%i==0) { 
                val= i;
            }
        }
        numer3 /= val;
        denom3 /= val;
               
        answer[0] = numer3;
        answer[1] = denom3;
        
        return answer;
    }
}