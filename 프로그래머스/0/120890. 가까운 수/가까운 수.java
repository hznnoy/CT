import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 200;
        Arrays.sort(array);
        
        for(int i=0; i<array.length; i++){
            int gap = Math.abs(array[i]-n);
            if(gap<min){
                min = gap;
                answer = array[i];
            }
        }
       return answer;
    }
}