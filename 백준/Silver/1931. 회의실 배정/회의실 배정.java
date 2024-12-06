import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken()); //시작시간
            time[i][1] = Integer.parseInt(st.nextToken()); //종료시간
        }

        //끝나는 시ㅣ간 기준 정렬
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){ // 끝나는 시간이 같은 경우 시작 시간 빠른 순으로 정렬
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });

        int count = 0;
        int prevEnd = 0;
        for(int i=0; i<n; i++){
            if(prevEnd>time[i][0]){ // 직전 종료시간 > 시작시간인 경우 건너뛰기
                continue;
            }
            prevEnd = time[i][1];
            count++;
        }
        System.out.print(count);
    }


}