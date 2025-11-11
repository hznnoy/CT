import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        boolean[] check = new boolean[people.length];
        Arrays.sort(people);
        int count = 0;
        int idx = 0;
        
        for(int i=people.length-1; i>=0; i--){
            if(!check[i]){
                if(people[idx]+people[i]<=limit){
                    check[i]=true;
                    check[idx]=true;
                    idx++;
                    count++;
                }else{
                    check[i]=true;
                    count++;
                }
            }
        }
        answer = count;
        return answer;
    }
}