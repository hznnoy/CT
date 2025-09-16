import java.lang.*;
import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        
        int x = dots[0][0];
        int y = dots[0][1];
        int w=0; 
        int h=0;
        
        for(int i=1; i<dots.length; i++){
            if(dots[i][0]!=x){
                w = Math.abs(dots[i][0]-x);
            }
            if(dots[i][1]!=y){
                h = Math.abs(dots[i][1]-y);
            }
        }
        return w*h;
    }
}