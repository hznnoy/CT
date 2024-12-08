import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] w = new int[n];

        for(int i=0; i<n; i++){
            w[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(w);
        int max = w[n-1];

        for(int i=n-1; i>=0; i--){
            if(max<w[i]*(n-i)){
                max = w[i]*(n-i);
            }
        }
        System.out.print(max);

    }
}