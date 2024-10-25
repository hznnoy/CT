import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt();
        
        if(m>=45){
            m-=45;
            System.out.print(h+" "+m);
        }else{
            m+=15;
            if(h==0){
                h=23;
            }else{
                h-=1;
            }
            System.out.print(h+" "+m);
        }
        s.close();
    }
}