import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 10001;
        boolean check = true;
        int c = 0;

        for(int i=m; i<=n; i++){
            check = true;
            if(i==1){
                check = false;
                c++;
            }
            for(int j=2; j<i; j++){
                if (i % j == 0) {
                    check = false;
                    c++;
                    break;
                }
            }
            if(check == true){
                sum += i;
                if(min>i){
                    min = i;
                }
            }
        }

        if(c == (n-m+1)){
            System.out.print(-1);
        }else{
            System.out.println(sum+"\n"+min);
        }
    }
}