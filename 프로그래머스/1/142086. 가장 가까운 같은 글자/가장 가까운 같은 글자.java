class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];

        answer[0] = -1;
        
        for(int i=1; i<len; i++){
            char c = s.charAt(i);
            int count = 0;
            boolean check = false;
            
            for(int j=i-1; j>=0; j--){
                count++;
                char compC = s.charAt(j);
                if(c==compC){
                    check = true;
                    answer[i]=count;
                    break;
                }
            }
            if(check==false) answer[i] = -1;
        }
        return answer;
    }
}