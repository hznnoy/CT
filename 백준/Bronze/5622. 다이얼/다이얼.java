import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int time = 0;
        
        for(int i=0; i<s.length();i++){
            if((s.charAt(i)-'A')>=0 && (s.charAt(i)-'A')<=2){
                time +=3;
            }else if((s.charAt(i)-'A')>=3 && (s.charAt(i)-'A')<=5){
                time +=4;
            }else if((s.charAt(i)-'A')>=6 && (s.charAt(i)-'A')<=8){
                time +=5;
            }else if((s.charAt(i)-'A')>=9 && (s.charAt(i)-'A')<=11){
                time +=6;
            }else if((s.charAt(i)-'A')>=12 && (s.charAt(i)-'A')<=14){
                time +=7;
            }else if((s.charAt(i)-'A')>=15 && (s.charAt(i)-'A')<=18){
                time +=8;
            }else if((s.charAt(i)-'A')>=19 && (s.charAt(i)-'A')<=21){
                time +=9;
            }else{
                time +=10;
            }
        }
        
        System.out.print(time);
    }
}