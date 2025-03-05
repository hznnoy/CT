import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w=0, h=0;
        
        for(int[] wallet : sizes){
            w = Math.max(w, Math.max(wallet[0], wallet[1]));
            h = Math.max(h, Math.min(wallet[0], wallet[1]));
        }
        
        answer = w*h;
        return answer;
    }
}