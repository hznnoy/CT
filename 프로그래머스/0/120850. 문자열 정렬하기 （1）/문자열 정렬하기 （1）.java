import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int len = my_string.length();
        int count =0;

        for(int i=0; i<len; i++){
            if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9'){
                count++;
            }
        }
        
        int[] answer = new int[count];
        int idx = 0;
        
        for(int i=0; i<len; i++){
            if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9'){
                answer[idx++] = my_string.charAt(i)-'0';
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}