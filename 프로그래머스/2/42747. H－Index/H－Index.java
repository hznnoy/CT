import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;

        Arrays.sort(citations); 

        for(int i=0; i<n; i++){
            int h = n-i;// i번째 논문보다 인용횟수가 크거나 같은 논문편수

            if(h<=citations[i]){
                answer = h;
                break;
            }
        }

        return answer;
    }
}
