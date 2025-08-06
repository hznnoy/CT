class Solution {
    public String solution(String letter) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] alpha = {'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n', 'o','p','q','r','s','t','u','v','w','x','y','z'};

        String[] s = letter.split(" ");
        
        for(int j=0; j<s.length; j++){
            for(int i=0; i<morse.length; i++){
                if(s[j].equals(morse[i])){
                    sb.append(alpha[i]);
                }
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}