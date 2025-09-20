import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer,Integer> hMap = new HashMap<>();
        for(int a : array){
            hMap.put(a,hMap.getOrDefault(a,0)+1);
        }
        int maxCount = 0;
        int maxValue = 0;
        for(Map.Entry<Integer,Integer> entry : hMap.entrySet()){

            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxValue = entry.getKey();
                System.out.println(maxCount+" "+maxValue);
            }else if(entry.getValue() == maxCount){
                maxValue = -1;
            }

        }
        answer = maxValue;
        return answer;
    }
}