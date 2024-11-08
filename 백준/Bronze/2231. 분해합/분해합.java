import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str_n = br.readLine();

        int n_length = str_n.length();
        int n = Integer.parseInt(str_n);

        int result = 0;

        for(int i= n -(9 * n_length); i<n; i++){ // 생성자 최솟값 = n - (9 * n의 자릿수)
            int num = i;
            int sum = 0;

            while(num != 0){ // 각 자리 수 합
                sum += num % 10;
                num /= 10;
            }

            if(sum + i == n){
                result = i;
                break;
            }
        }

        System.out.print(result);

    }
}