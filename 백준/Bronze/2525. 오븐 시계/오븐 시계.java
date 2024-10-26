import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int a = (m1+m2)/60;
        int m3;
        
        if(h+a>23){
            h=(h+a)-24;
            m3=(m1+m2)-(60*a);
            System.out.println(h+" "+m3);
        }else{
            h+=a;
            m3=(m1+m2)-(60*a);
            System.out.println(h+" "+m3);
        }   
        s.close();
    }
}