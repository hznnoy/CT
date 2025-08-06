import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int len = before.length();
        ArrayList<Character> b = new ArrayList<>();
        
        for(int i=0; i<len; i++){
            b.add(before.charAt(i));
        }
        
        for(int i=0; i<len; i++){
            if(b.contains(after.charAt(i))){
                b.remove(b.indexOf(after.charAt(i))); // 같은 문자 있으면 arraylist에서 제거   
            }
        }
        
        if(b.size()>0){ // arraylist에 남은 원소가 있다면(만들 수 없는 경우)
            answer = 0;
        }else{
            answer = 1;
        }
        return answer;
    }
}