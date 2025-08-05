class Solution {
    public int solution(int order) {
        int answer = 0;
        String s_order = String.valueOf(order);
        int len = s_order.length();
        
        for(int i=0; i<len; i++){
            if(s_order.charAt(i)-'0'==3 || s_order.charAt(i)-'0'==6 || s_order.charAt(i)-'0'==9){
                answer++;
            }
        }
        return answer;
    }
}