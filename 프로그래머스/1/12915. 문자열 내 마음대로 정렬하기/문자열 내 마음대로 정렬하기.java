import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> arr = new ArrayList<>();
        String[] answer = new String[strings.length];
        
        for(String str : strings){
            arr.add(String.valueOf(str.charAt(n)) + str);
        }
        
        Collections.sort(arr);
        
        for(int i=0; i<arr.size(); i++){
            int len = arr.get(i).length();
            answer[i] = arr.get(i).substring(1,len);
        }
        
        return answer;
    }
}
