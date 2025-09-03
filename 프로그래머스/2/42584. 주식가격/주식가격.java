import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        // 주식가격이 감소하지 않았다면 인덱스를 스택에 넣는다
        // prices[stack.peek()] = 이전 가격
        for(int i=0; i<prices.length; i++){
            while(!stack.empty() && prices[i]<prices[stack.peek()]){ // 가격이 떨어진 경우
                answer[stack.peek()] = i-stack.peek(); // 감소한 시점 - 처음 스택에 들어간 시점
                stack.pop();
            }
            stack.push(i);
        }
        
        //stack에 있는 값은 끝까지 주식 가격이 떨어지지 않은 경우
        while(!stack.empty()){
            answer[stack.peek()] = prices.length - stack.peek() -1;
            stack.pop();
        }
        
        return answer;
    }
}