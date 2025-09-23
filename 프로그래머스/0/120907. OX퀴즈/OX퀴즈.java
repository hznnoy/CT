class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++ ){
            String[] terms = quiz[i].split(" ");
            int x = Integer.parseInt(terms[0]);
            String operator = terms[1];
            int y = Integer.parseInt(terms[2]);
            int z = Integer.parseInt(terms[4]);
            
            if(operator.equals("+")){
                if((x + y) != z) answer[i]="X";
                else if((x + y) == z) answer[i]="O";
            }else{
                if((x - y) != z) answer[i]="X";
                else if((x - y) == z) answer[i]="O";
            }            
        }
        
        return answer;
    }
}