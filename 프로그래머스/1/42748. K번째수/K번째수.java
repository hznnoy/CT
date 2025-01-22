import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] a = new int[array.length];
        int[] answer = new int[commands.length];
        
        for(int n=0; n<commands.length; n++){
            a = Arrays.copyOfRange(array, commands[n][0]-1, commands[n][1]);
            Arrays.sort(a);
            answer[n] = a[commands[n][2]-1];
        }
        
        return answer;
    }
}