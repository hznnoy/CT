class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        StringBuilder sb =new StringBuilder();
        int len = my_string.length();
        
        for(int i=0; i<len; i++){
            String s = String.valueOf(my_string.charAt(i));
            if(s.equals(letter)){
                continue;
            }else{
                sb.append(my_string.charAt(i));
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}