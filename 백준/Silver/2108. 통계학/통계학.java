import java.io.*;
import java.util.*;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int [] nums = new int[n];
        int sum = 0;

        int [] count = new int[8001];

        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(br.readLine());
            sum+=nums[i];
        }

        int avg = (int)Math.round((double)sum / n); 
        //소수점 버림 방지 위해 sum이나 n 중 하나는 double로 형변환 해줌
        if(avg==-0){
            avg = 0;
        }
        sb.append(avg+"\n"); // 평균값

        Arrays.sort(nums);
        sb.append(nums[n/2]+"\n"); // 중간값

        // 최빈값
        for(int i=0; i<n; i++){
            if(nums[i]<0){
                count[Math.abs(nums[i])+4000]++;  // 음수인 경우 index 4001 이후로 저장
            }else{
                count[nums[i]]++;
            }
        }

        int max = 0;
        LinkedList<Integer> indexs = new LinkedList<>();
        indexs.add(0);
        for(int i=0; i<8001; i++){
            if(max<count[i]){
                indexs.clear();
                max = count[i];
                if(i>4000){
                    indexs.add((i-4000)*(-1));  // 음수꼴로 다시 변환
                }else{
                    indexs.add(i);
                }
            }else if(max==count[i]){
                if(i<=4000){
                    indexs.add(i);
                }else{
                    indexs.add((i-4000)*-1);
                }
            }
        }
        Collections.sort(indexs);

        if(indexs.size()>1){ //최빈값이 여러개인 경우
            sb.append(indexs.get(1)+"\n"); //두번째로 작은 값 출력
        }else{
            sb.append(indexs.get(0)+"\n");
        }

        // 범위
        int range = nums[n-1]-nums[0];
        sb.append(range);

        System.out.print(sb);
    }
}