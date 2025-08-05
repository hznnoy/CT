class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb =new StringBuilder();
        int len = my_string.length();
        
        for(int i=0; i<len; i++){
            String c = String.valueOf(my_string.charAt(i));
            if(sb.toString().contains(c)) {
                continue;
            }else{
                sb.append(c);
            }
            
        }
        
        answer= sb.toString();
        return answer;
    }
}