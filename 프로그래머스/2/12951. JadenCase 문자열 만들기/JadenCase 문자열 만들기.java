import java.util.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        
        // 공백을 포함하여 분할하기 위해 세 번째 인자 true 사용
        StringTokenizer st = new StringTokenizer(s, " ", true);     
        
        while(st.hasMoreTokens()){
            String str = st.nextToken();
        
            if(str.equals(" ")){
                sb.append(str);
            }else{
                String first = str.substring(0,1).toUpperCase();
                String remain = str.substring(1);
                sb.append(first+remain);
            }
        }
        return sb.toString();
    }
}
