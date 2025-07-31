class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        
        for(int i=0; i<len; i++){
            char c = my_string.charAt(i);

            for(int j=0; j<n; j++){
                sb.append(c);
            }
        }
        answer = sb.toString();
        return answer;
    }
}