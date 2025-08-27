import java.util.*;

class Solution{
    public boolean solution(String s){
        boolean answer = true;
        Stack stack = new Stack();
        String[] str = s.split("");
        
        for(String c : str){                
            if(c.equals("(")){
                stack.push(c);
            }else if(c.equals(")")){
                if(stack.empty()){
                    answer = false;
                    break;
                }else{
                    stack.pop();
                }
            }
        }
        
        if(!stack.empty()) answer = false;
        
        return answer;   
    }
}