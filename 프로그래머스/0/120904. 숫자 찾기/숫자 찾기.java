class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String st = String.valueOf(num);
        int [] starr = new int[st.length()];
        
        for(int i=0; i<st.length(); i++){
            starr[i] = st.charAt(i)-'0';
            if(starr[i]==k){
                answer = i+1;
                break;
            }
        }
    
        return answer;
    }
}