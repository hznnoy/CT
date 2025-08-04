class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = cipher.length();
        
        for(int i=1; i<=len/code; i++){
            sb.append(cipher.charAt(i*code-1));
    
        }
        answer = sb.toString();
        return answer;
    }
}