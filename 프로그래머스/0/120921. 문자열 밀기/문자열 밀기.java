import java.util.*;

class Solution {
    static int len;
    static String[] arr;
    
    public int solution(String A, String B) {
        arr = A.split("");
        len = A.length();
        int count = 0;
        
        for(int i=0; i<len; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<len; j++){
                sb.append(arr[j]);
            }
            
            if(sb.toString().equals(B)){
                return count;
            }
            
            push();
            count++;          
        }
        return -1;
    }
    
    static void push(){
        String last = arr[len-1];
        
        for(int i=len-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
}