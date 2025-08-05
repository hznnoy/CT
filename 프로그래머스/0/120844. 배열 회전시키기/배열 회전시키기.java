class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];
        
        int last = numbers[len-1];
        int first = numbers[0];
        
        if(direction.equals("right")){
            answer[0] = last;
            for(int i=0; i<len-1;i++){
                answer[i+1] = numbers[i];
            }
        }else if(direction.equals("left")){
                answer[len-1] = first;
            for(int i=1; i<len;i++){
                answer[i-1] = numbers[i];
            }
        }
        return answer;
    }
}