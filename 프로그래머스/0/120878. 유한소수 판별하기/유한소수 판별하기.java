class Solution {
    public int solution(int a, int b) {       
        // 기약분수 만들기
        for(int i=b; i>=1; i--){
            if(a%i==0 && b%i==0){ // 최대공약수
                a /= i;
                b /= i;
            }  
        }
        System.out.println(a +" "+b);
        
        // 유한소수 판별
        for(int i=2; i<=b; i++){
            if(b%i==0){
                if(i!=2 && i!=5){
                    return 2;
                }
                b /= i;
                i=1;
            }
        }
        return 1;
    }
}