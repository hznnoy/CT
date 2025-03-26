import java.io.*;
import java.util.*;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append("<");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=n; i++){
            q.add(i);
        }

        while(q.size() != 1){
            for(int i=0; i<k-1; i++){
                int a = q.poll();
                q.add(a);
            }
            int b = q.poll();
            sb.append(b+", ");
        }
        
        sb.append(q.poll()); //마지막 숫자 출력
        sb.append(">");
        System.out.print(sb);
    }
}