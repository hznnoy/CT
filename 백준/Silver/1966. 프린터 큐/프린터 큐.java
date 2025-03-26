import java.io.*;
import java.util.*;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=0; tc<t; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());  // 문서 개수
            int m = Integer.parseInt(st.nextToken());  // 출력 순서 확인 할 문서 위치

            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                q.add(new int [] {i, Integer.parseInt(st.nextToken())});
            }

            int cnt = 0;

            while(!q.isEmpty()){
                int[] front = q.poll();
                boolean isMax = true;

                for(int i=0; i<q.size(); i++){
                    if(front[1]<q.get(i)[1]){
                        isMax = false;
                    }
                }

                if(isMax == true){
                   if(front[0]==m){
                       cnt++;
                       break;
                   }else{
                       cnt++;
                   }
                } else{
                    q.add(front);
                }

            }
            sb.append(cnt+"\n");

        }
        System.out.print(sb);

    }
}