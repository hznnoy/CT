import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int count = 0;
        
        Arrays.sort(sides);
        
        // 배열 내에 가장 긴 변이 있는 경우 
        for(int i=1; i<sides[1]; i++){
            if(sides[0]+i > sides[1]) count++;
        }
        
        // 나머지 한 변이 가장 긴 경우
        int line = sides[1]+1;
        while(true){
            if(sides[0]+sides[1] >= line){
                count++;
            }else{
                break;
            }
            
            line++;
        }
        
        return count;
    }
}