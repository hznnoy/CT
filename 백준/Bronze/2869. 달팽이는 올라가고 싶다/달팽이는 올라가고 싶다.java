import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int day = (V-A) / (A-B); //v-a = 정상 오르기 전 날 최소 높이, a-b = 하루에 오르는 높이
        if((V-A)%(A-B)!=0){ // 정상 오르기 전 날 낮에 v-a보다 높게 도달하는 경우
            day++;
        }
        System.out.print(day+1); // 정상 오르기 전 날까지 계산해줬으므로 +1일
    }
}