import java.util.*;

class Solution {
    static boolean[] visited;
    static int answer=0;
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
                
        dfs(0, begin, target, words);
        return answer;
    }

    static void dfs(int depth, String begin, String target, String[] words){
        if(begin.equals(target)){
            answer = depth;
            return;
        }
        
        for(int i=0; i<words.length; i++){
            if(!visited[i] && canConvert(begin, words[i])){
                visited[i]=true;
                dfs(depth+1, words[i], target, words);
                visited[i]=false;
            }
        }
    }
    
    static boolean canConvert(String current, String word){
        int count = 0;
        
        for(int i=0; i<current.length(); i++){
            if(current.charAt(i) == word.charAt(i)){
                count++;
            }
        }
        if(count==current.length()-1){ // current와 word가 한 글자만 다른 경우
            return true;
        }
        
        return false;
    }
}