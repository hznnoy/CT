import java.util.*;

class Solution {
    private static final char[] VOWELS = {'A', 'E', 'I', 'O', 'U'};
    private int count = 0;      
    private int answer = 0;    
    private boolean found = false;

    public int solution(String word) {
        dfs(new StringBuilder(), word);
        return answer;
    }

    private void dfs(StringBuilder sb, String target) {
        if (found) return;                

        if (sb.length() > 0) {             
            count++;                       
            if (sb.toString().equals(target)) {
                answer = count;
                found = true;
                return;
            }
        }

        if (sb.length() == 5) return;      

        for (char c : VOWELS) {          
            sb.append(c);
            dfs(sb, target);
            sb.deleteCharAt(sb.length() - 1);
            if (found) return;            
        }
    }
}