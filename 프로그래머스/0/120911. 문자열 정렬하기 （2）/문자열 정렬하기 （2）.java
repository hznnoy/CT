import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        int len = my_string.length();
        
        String lowst = my_string.toLowerCase();
        
        char[] st = new char[len];
        
        for(int i=0; i<len; i++){
            st[i] = lowst.charAt(i);
        }
        
        Arrays.sort(st);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<st.length; i++){
            sb.append(st[i]);
        }
        answer = sb.toString();
        return answer;
    }
}