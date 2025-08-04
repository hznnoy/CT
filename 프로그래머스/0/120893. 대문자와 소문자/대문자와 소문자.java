class Solution {
    public String solution(String my_string) {
        String answer = "";
        int len = my_string.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<len; i++){
            char c = my_string.charAt(i);
            if(c>='a' && c<='z'){ // 소문자라면
                sb.append((char)(c-32));
                
            }else if(c>='A' && c<='Z'){ // 대문자라면 
                sb.append((char)(c+32));
            }
        }
        answer = sb.toString();
        return answer;
    }
}