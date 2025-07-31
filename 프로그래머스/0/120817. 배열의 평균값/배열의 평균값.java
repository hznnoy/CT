class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        double length = numbers.length;
        for(int i:numbers){
            sum+=i;
        }
        answer = sum/length;
        return answer;
    }
}