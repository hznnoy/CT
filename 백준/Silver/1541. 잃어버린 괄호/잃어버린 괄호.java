import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer sub = new StringTokenizer(br.readLine(),"-");

        int result = Integer.MAX_VALUE;

        while(sub.hasMoreTokens()){
            int sum = 0;

            StringTokenizer add = new StringTokenizer(sub.nextToken(),"+");

            while(add.hasMoreTokens()){
                sum += Integer.parseInt(add.nextToken());
            }

            if(result==Integer.MAX_VALUE){ // 첫번째 토큰인 경우 sum값이 첫번째 수가 됨
                result = sum;
            }else{
                result -= sum;
            }
        }
        System.out.print(result);

    }
}