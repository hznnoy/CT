import java.util.*;

class Solution {
    static int[] num;
    static Set<Integer> prime = new HashSet<>();
    static boolean [] visited;
    
    public int solution(String numbers) {
        int len = numbers.length();
        num = new int[len];
        visited = new boolean[len];

        for(int i=0; i<len;i++){
            num[i] = numbers.charAt(i)-'0';
        }
        
        for(int i=1; i<=len; i++){ // 모든 자리수의 순열 확인
            check("", i);
        }
        
        int answer = 0;
        for(int n : prime){
            if(isPrime(n)){
                answer++;
            }
        }
        return answer;
    }
    
    static void check(String str,int i){
        if(str.length()==i){
            int val = Integer.parseInt(str);
            prime.add(val);
            return;
        }
        
        for(int j=0; j<num.length; j++){
            if(!visited[j]){
                visited[j]=true;
                check(str+num[j], i);
                visited[j]=false;
            }
        }
        
        return;
    }
    
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}