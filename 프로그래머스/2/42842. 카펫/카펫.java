class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = 0;
        int height = 0;
        if(yellow==1){
            answer[0] = 3; answer[1] = 3;
        }
        
        for(int i=1; i<=yellow/2; i++){
            if(yellow%i==0){
                width = yellow/i; // 긴게 가로
                height = i;
                
                if((2*(width+height)+4)==brown){
                    answer[0] = width+2;
                    answer[1] = height+2;
                    break;
                }
            }
        }
        return answer;
    }
}