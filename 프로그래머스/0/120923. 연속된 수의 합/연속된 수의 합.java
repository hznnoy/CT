class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int sumFromOne = 0; 
        for(int i=1; i<=num; i++){
            sumFromOne += i;
        }
        
        int move = (total-sumFromOne)/num;
        
        for(int i=0; i<num; i++){
            answer[i] = 1+move+i;
        }
        
        return answer;
    }
}