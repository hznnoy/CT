class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        
        if(my_str.length()%n!=0){
            int len = my_str.length()/n;
            answer = new String[len+1];
            int start = 0;
            int end = n;

            for(int i=0; i<len; i++){
                answer[i] = my_str.substring(start, end);
                start += n;
                end = n*(i+2);
            }
            answer[len] = my_str.substring(start, my_str.length());
        }else{
            int len = my_str.length()/n;
            answer = new String[len];
            int start = 0;
            int end = n;
            
            for(int i=0; i<len; i++){
                answer[i] = my_str.substring(start, end);
                start += n;
                end = n*(i+2);
            }
        }
        
        return answer;
    }
}