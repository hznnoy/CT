import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int len = 0;
        
        for(int i:numlist){
            if(i%n==0){
                len++;
            }
        }
        int[] answer = new int[len];

        int idx = 0;
        
        for(int i:numlist){
            if(i%n==0){
                answer[idx++] = i;
            }
        }
        return answer;
    }
}