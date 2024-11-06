import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++){
            int a = Integer.parseInt(st.nextToken());
            boolean check = true;

            if(a==1){
                check = false;
                continue;
            }
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    check = false;
                }
            }
            if (check == true) {
                count++;
            }
        }

        System.out.print(count);
    }
}