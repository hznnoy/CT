import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
        int b = s.nextInt();
        int x = b % 10;
        int y = (b%100)/10; 
        int z = b / 100;

		System.out.println(a*x);
        System.out.println(a*y);
		System.out.println(a*z);
        System.out.println(a*b);

		s.close();
	}
}