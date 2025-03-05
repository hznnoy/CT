class Solution {
    
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possible = {"aya", "ye", "woo", "ma"};

        for(String b : babbling){
            for(String p : possible){
                if(b.contains(p)){
                    b = b.replaceAll(p, "-");
                    if(b.replaceAll("-","").isEmpty()){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}