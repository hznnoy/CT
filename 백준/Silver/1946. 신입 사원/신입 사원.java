import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int tc=0; tc<t; tc++){
            int n = Integer.parseInt(br.readLine());
            int[][] a = new int[n][2];
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                a[i][0] = Integer.parseInt(st.nextToken()); //서류점수
                a[i][1] = Integer.parseInt(st.nextToken()); //면접점수
            }

            Arrays.sort(a, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return Integer.compare(o1[0],o2[0]);
                }
            }); //서류 등수대로 정렬

            int temp = a[0][1];
            int count = 1;
            for(int i=1; i<n; i++){
                if(temp>a[i][1]){
                    temp = a[i][1];
                    count++;
                }
            }
            sb.append(count+"\n");
        }
        System.out.println(sb);
    }
}