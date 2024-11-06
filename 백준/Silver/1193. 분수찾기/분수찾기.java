import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int a = 1;
        int range = 1;

        if(x==1){
            System.out.print("1/1");
        }else{
            while(range <= x){
                range = range + a;
                a++;
            }
            if(a%2!=0){  //a가 홀수이면
                System.out.print((a-(range-x))+"/"+(range-x));
            }else{  //a가 짝수이면
                System.out.print((range-x)+"/"+(a-(range-x)));
            }
        }

    }
}