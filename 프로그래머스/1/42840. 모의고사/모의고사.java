import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int length = answers.length;

        int[] counts = new int[3];
        ArrayList<Integer> index = new ArrayList<>();
    
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<length; i++){
            if(first[i%first.length]==answers[i]) counts[0]++;
            if(second[i%second.length]==answers[i]) counts[1]++;
            if(third[i%third.length]==answers[i]) counts[2]++;
        }
        
        int max = 0; //최댓값 설정
        for(int i=0; i<3; i++){
            max = Math.max(counts[i],max);
        }
        
        for(int i=0; i<3; i++){
            if(max==counts[i]){
                index.add(i);
            }
        }        
        
        int []answer = new int[index.size()];
        for(int i=0; i<index.size(); i++){
            answer[i]=index.get(i)+1;
        }
        
        return answer;
    }
}