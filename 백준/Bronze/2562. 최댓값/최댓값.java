import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = 0;
        int index = 0;
        for (int i=1; i<=9; i++){
            int a = Integer.parseInt(br.readLine());
            if(max<a){
                max=a;
                index = i;
            }
        }
        System.out.print(max+"\n"+index);
    }
}