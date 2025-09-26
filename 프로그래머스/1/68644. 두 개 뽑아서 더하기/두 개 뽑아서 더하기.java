import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        List<Integer> nums = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Set<Integer> hash;
        
        for(int number : numbers) {
            nums.add(number);
        }
        
        Collections.sort(nums);
        
        for(int i = 0; i < nums.size(); i++) {
            for(int j = i+1; j < nums.size(); j++) {
                result.add(nums.get(i) + nums.get(j));
            }
        }
        
        hash = new HashSet<>(result);
        answer = new int[hash.size()];
        int j = 0;
        for(Integer h : hash) {
            answer[j++] = h;
        }
        Arrays.sort(answer);
        return answer;
    }
}