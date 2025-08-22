class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int ic = (int)c;

            if(c==' '){
                answer += ' ';
            }else if(c>='a' && c<='z'){
                answer += (char)('a' + (ic+n-'a')%26);
            }else if(c>='A' && c<='Z'){
                answer += (char)('A' + (ic+n-'A')%26);
            }

        }

        return answer;
    }
}