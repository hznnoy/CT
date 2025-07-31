class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String st1 : s1){
            for(String st2 : s2){
                if(st1.equals(st2)){
                    answer++;
                }
            }
        }
        return answer;
    }
}