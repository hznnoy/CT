import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int len = array.length;
        int mid = len/2;
        
        Arrays.sort(array);
    
        answer = array[mid];
        
        return answer;
    }
}