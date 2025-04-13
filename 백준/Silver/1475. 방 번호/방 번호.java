import java.io.*;
import java.util.*;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int [] check = new int[10];

        int count = 0;

        for(int i=0; i<s.length(); i++){
            int num = s.charAt(i)-'0';
            if(num == 9){
                num = 6;
            }
            check[num]++;
        }

        check[6] = check[6]/2 + check[6]%2;

        for(int i=0; i<9; i++){
            count = Math.max(count, check[i]);
        }
        count = Math.max(check[6],count);
        System.out.print(count);
    }
}