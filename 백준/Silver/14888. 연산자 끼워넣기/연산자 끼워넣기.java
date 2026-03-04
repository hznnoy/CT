import java.util.*;
import java.io.*;

public class Main{
    static int n, arr[];
    static int[] op = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<4; i++){
            op[i] = Integer.parseInt(st.nextToken());
        }

        calc(arr[0],1);
        System.out.println(max);
        System.out.println(min);
    }

    static void calc(int sum, int cnt){
        if(cnt == n){
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        for(int i=0; i<4; i++){
            if(op[i] > 0){
                op[i]--;

                switch(i){
                    case 0 :
                        calc(sum + arr[cnt], cnt+1);
                        break;
                    case 1 :
                        calc(sum - arr[cnt], cnt+1);
                        break;
                    case 2 :
                        calc(sum * arr[cnt], cnt+1);
                        break;
                    case 3 :
                        calc(sum / arr[cnt], cnt+1);
                        break;
                }
                op[i]++;
            }
        }

    }

}