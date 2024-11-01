import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}