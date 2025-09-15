class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int i=0; i<dic.length; i++){
            boolean check = true;
            for(String s : spell){
                if(!dic[i].contains(s)) check = false;
            }
            if(check) answer = 1;
        }
        return answer;
    }
}