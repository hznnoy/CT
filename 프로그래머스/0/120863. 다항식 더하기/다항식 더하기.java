import java.util.*;

class Solution {
    public String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();
        if(!polynomial.contains("+")){
            return polynomial;
        }
        String [] terms = polynomial.split(" ");
        int x = 0; // x의 계수
        int n = 0; // 상수항
        
        for(int i=0; i<terms.length; i+=2){
            int len = terms[i].length();
            if(terms[i].charAt(len-1) == 'x'){
                String strX = terms[i].substring(0,len-1);
                if(strX.equals("")) strX="1"; // x의 계수가 1일 경우 예외처리
                x += Integer.parseInt(strX);
            }else{
                n += Integer.parseInt(terms[i]);
            }
        }
        if(x!=0){
            if(x==1) sb.append("x");
            else sb.append(x).append("x");
        }
        
        if(n!=0){
            if(sb.length()>0) sb.append(" + ");
            sb.append(n);
        }
        
        return sb.toString();
    }
}