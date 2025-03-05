import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book); //정렬해주어 순서대로 비교할 수 있도록 함
        
        for(int i=0; i<phone_book.length-1; i++){ 
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
                   
            }
        }
        
        return answer;
    }
}