class Solution {
    public int[] solution(String[] strlist) {
        int len = strlist.length;
        
        int[] answer = new int[len];
        
        int idx = 0;
        for(String str : strlist){
            answer[idx++] = str.length();
        }
        
        return answer;
    }
}