import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        ArrayList<Integer> height = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = n-1; i>=0; i--) {
            height.add(arr[i], i + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i : height) {
            sb.append(i + " ");
        }

        System.out.print(sb);
    }
}