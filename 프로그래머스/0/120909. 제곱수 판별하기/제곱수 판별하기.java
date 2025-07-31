import java.lang.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        double route = Math.sqrt(n);
        if(route%1==0){
            answer =1;
        }else{
            answer =2;
        }
        return answer;
    }
}