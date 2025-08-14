class Solution {
    public int solution(int[] numbers, int k) {
        int len = numbers.length;
        int idx = 0;
        
        for(int i=1; i<k; i++){
            idx = (idx+2)%len;
        }
        
        return numbers[idx];
    }
}