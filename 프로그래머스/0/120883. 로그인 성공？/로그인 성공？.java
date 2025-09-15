class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        boolean id = false;
        boolean pw = false;
        
        for(int i=0; i<db.length; i++){
            if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])){
                answer = "login"; 
                return answer;
            }else{
                if(id_pw[0].equals(db[i][0])){
                    id = true;
                    if(!id_pw[1].equals(db[i][1])) answer = "wrong pw";
                } else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])){
                    pw = true;
                }
            } 
        }
        
        if(id==false) answer = "fail";
        
        
        return answer;
    }
}