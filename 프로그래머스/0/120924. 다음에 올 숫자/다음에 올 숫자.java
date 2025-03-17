class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int sub = 0, mul = 0;
        int len = common.length;
        
        if(common[1]-common[0] == common[2]-common[1]){
            sub = common[1]-common[0];
            answer = common[len-1]+sub;
        }else if (common[1]/common[0] == common[2]/common[1]){
            mul = common[1]/common[0];
            answer = common[len-1]*mul;
        }
        
        return answer;
    }
}