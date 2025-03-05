import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        
        // 각 명함의 가로, 세로 길이 중 더 큰 쪽을 [i][i][0]으로 이동
        for(int i=0; i<sizes.length; i++){ 
            for(int j=0; j<sizes.length; j++){
                if(sizes[i][0]<sizes[i][1]){
                    temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
            }
        }
        
        Arrays.sort(sizes, (o1,o2) -> { // 가로 길이 내림차순 정렬
            return o2[0]-o1[0];
        });
        int max_w = sizes[0][0];
        
        Arrays.sort(sizes, (o1,o2) -> { // 세로 길이 내림차순 정렬
            return o2[1]-o1[1];
        });
        int max_h = sizes[0][1];
        
        answer = max_w * max_h; // 최댓값끼리 곱하여 return 
        return answer;
    }
}