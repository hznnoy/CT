import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=T; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            System.out.print("#"+tc+" ");
            Arrays.stream(a).sorted().forEach((item)->System.out.print(item+" "));
            System.out.print("\n");

        }
    }
}