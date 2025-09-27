import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int prev = arr[0];
        answer.add(prev);
        for(int i=1; i<arr.length; i++){
            int now = arr[i];
            if(prev != now) answer.add(now);
            prev = now;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}