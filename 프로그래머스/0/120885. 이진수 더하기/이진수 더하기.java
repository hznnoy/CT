import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        if(Integer.parseInt(bin1)==0 && Integer.parseInt(bin2)==0){
            answer = "0";
        }else{
            int sum = toTen(bin1) + toTen(bin2);    
            answer = toBinary(sum); 
        }
        
        return answer;
    }
    
    public int toTen(String s){
        ArrayList<Integer> arr = new ArrayList<>();

        String[] str = s.split("");
        int num = 0;
        
        for(int i=0; i<s.length(); i++){
            int val = Integer.parseInt(str[i]);
            arr.add(val);
        }
        
        Collections.reverse(arr);
        
        for(int i=0; i<arr.size(); i++){
            num += arr.get(i) * Math.pow(2,i);
        }
        return num;
    }
    
    
    public String toBinary(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n /= 2;
            
        }
        return sb.reverse().toString();
    }
}