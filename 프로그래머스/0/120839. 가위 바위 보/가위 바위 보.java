class Solution {
    public String solution(String rsp) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = rsp.length();
        for(int i=0; i<len; i++){
            if(rsp.charAt(i)-'0'==2){
                sb.append("0");
            }else if(rsp.charAt(i)-'0'==0){
                sb.append("5");
            }else if(rsp.charAt(i)-'0'==5){
                sb.append("2");
            }
        }
        answer = sb.toString();
        return answer;
    }
}