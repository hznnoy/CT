class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        
        for(int i=0; i<len; i++){
            if(my_string.charAt(i)=='a' || my_string.charAt(i)=='e' || my_string.charAt(i)=='i' ||my_string.charAt(i)=='o' ||my_string.charAt(i)=='u'){
                continue;
            }else{
                sb.append(my_string.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }
}