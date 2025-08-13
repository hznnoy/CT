import java.lang.*;
import java.util.*;

class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int answer = Integer.parseInt(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(arr[i].equals("Z")){
                answer -= Integer.parseInt(arr[i-1]);
            }else{
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}