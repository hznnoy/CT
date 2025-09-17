import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] hateThree = new int[n+1];
        int num = 0;
        
        for(int i=1; i<n+1; i++){
            num++;
            while(num%3==0 || String.valueOf(num).contains("3")) num++;
            
            hateThree[i] = num;
        }
        answer = hateThree[n];
        
        Arrays.stream(hateThree).forEach(System.out::println);
        return answer;
    }
}