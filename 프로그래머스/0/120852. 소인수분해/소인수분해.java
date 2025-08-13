import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2; i<=n; i++){
            if(n%i==0){
                if(isPrime(i)) arr.add(i);
                else continue;
            }
        }
        int[] answer = new int[arr.size()];

        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    
    public boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false; 
            }
        }
        return true;
    }
}