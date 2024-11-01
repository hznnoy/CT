import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        int N = s.nextInt();
        int sum=0;
        for(int i=0; i<N; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            sum += a*b;
        }
        if(sum==X){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}