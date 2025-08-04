class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        int len = my_string.length();
        char[] arr = new char[len];
        
        for(int i=0; i<len; i++){
            arr[i] = my_string.charAt(i);
            System.out.print(arr[i]);
        }
        
        char temp1 = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp1;
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len; i++){
            sb.append(arr[i]);
        }
        answer = sb.toString();
        return answer;
    }
}