import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] len = new long[n-1];
        for(int i=0; i<n-1; i++){
            len[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());

        long[] cost = new long[n];
        for(int i=0; i<n; i++){
            cost[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        long min = cost[0]; //첫번째 도시 가격으로 초기값 설정

        for(int i=0; i<n-1; i++){
            if(cost[i]<min){ //다음 도시 가격이 초기값보다 작으면 min 갱신
                min = cost[i];
            }
            sum += (min * len[i]);
        }

        System.out.print(sum);

    }
}