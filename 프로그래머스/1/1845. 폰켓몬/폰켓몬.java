import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int length = nums.length/2;
        
        HashMap <Integer, Integer> h = new HashMap();
        
        for(int i=0; i<nums.length; i++){  
            h.put(nums[i],0);                       
        }
        
        if(h.size()<length){
            return h.size();
        }else{
            return length;
        }
    }
}