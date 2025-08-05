class Solution {
    public String solution(int age) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        String s_age = String.valueOf(age);
        int len = s_age.length();
        int[] num = {0, 1, 2, 3, 4, 5 ,6, 7, 8, 9};
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        
        for(int i=0; i<len; i++){
            for(int j=0; j<10; j++){
                if(s_age.charAt(i)-'0' == num[j]){
                   sb.append(alpha[j]); 
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}