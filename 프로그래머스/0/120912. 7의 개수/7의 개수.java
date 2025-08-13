class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i:array){
            String str = String.valueOf(i);
            String[] strs = str.split("");
            
            for(int j=0; j<strs.length; j++){
                if(Integer.parseInt(strs[j])==7) answer++;
            }
        }
        return answer;
    }
}