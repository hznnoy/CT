import java.io.*;
import java.nio.Buffer;
import java.util.*;

class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=1; tc<=T; tc++){
            int n = Integer.parseInt(br.readLine()); //n초동안 시행
            int speed = 0;
       	 	int distance = 0;
            
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());

                if(a!=0){
                    int add_speed = Integer.parseInt(st.nextToken());
                    if(a==1){
                        speed += add_speed;
                    }else if(a==2){
                        if(add_speed>speed){
                            speed = 0;
                        }else{
                            speed -= add_speed;
                        }
                    }
                }
                distance += speed;
            }
            sb.append("#"+tc+" "+distance+"\n");

        }
        System.out.print(sb);
    }
}