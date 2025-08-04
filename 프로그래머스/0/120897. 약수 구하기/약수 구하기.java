import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        int len = arr.size();
        int[] answer = new int[len];
        
        int idx = 0;
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer[idx++] = i;
            }
        }

        return answer;
    }
}