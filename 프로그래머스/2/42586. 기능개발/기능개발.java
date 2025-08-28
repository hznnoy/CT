import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> anslist = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++){
            if((100-progresses[i])%speeds[i]==0){
                queue.offer((100-progresses[i])/speeds[i]);
            }else{
                queue.offer((100-progresses[i])/speeds[i] + 1);
            }
        }
        
        int poll = queue.poll();
        int day = 1;

        while(!queue.isEmpty()){

            if(poll >= queue.peek()){
                day++;
                queue.poll();
            }else{
                anslist.add(day);
                day = 1;
                poll = queue.poll();
            }
        }
        
        anslist.add(day);
        
        return anslist.stream().mapToInt(i -> i).toArray();
    }
}