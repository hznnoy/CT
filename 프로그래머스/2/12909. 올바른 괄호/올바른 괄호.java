class Solution {
    public boolean solution(String s) {
        if ((s.length() & 1) == 1) return false;

        int bal = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);   
            if (c == '(') {
                bal++;
            } else { 
                if (bal == 0) return false;  
                bal--;
            }
        }
        return bal == 0; 
    }
}
