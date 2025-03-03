import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap <String,Integer> h = new HashMap();
        int c = completion.length;
        
        for(int i=0; i<c; i++){
            h.put(participant[i], h.getOrDefault(participant[i],0) +1);
            h.put(completion[i], h.getOrDefault(completion[i],0) -1);
        }        
        h.put(participant[c], h.getOrDefault(participant[c],0) +1);
        
        for(Map.Entry<String,Integer> entry : h.entrySet()){
            if(entry.getValue()==1){
                answer = entry.getKey();
            }
        }
        return answer;
    }
}