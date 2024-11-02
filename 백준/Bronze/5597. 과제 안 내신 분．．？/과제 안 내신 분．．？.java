import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] a = new int[31];

        for(int i=0; i<28; i++){
            a[s.nextInt()]=1;
        }
        
        for(int j=1; j<=30; j++){
            if(a[j]!=1){
                System.out.println(j);
            }
        }
    }
}