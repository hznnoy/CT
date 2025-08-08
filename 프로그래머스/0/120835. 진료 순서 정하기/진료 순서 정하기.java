import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i:emergency){
            list.add(i);
        }
            
        Collections.sort(list, Collections.reverseOrder());

        for(int i=0; i<len; i++){
            answer[i] = list.indexOf(emergency[i])+1;
        }
        return answer;
    }
}