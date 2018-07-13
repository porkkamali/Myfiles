package tom;

import java.util.Scanner;

public class Tom {
	public static void main(String args[]) {
		Scanner ip = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int a = ip.nextInt();
		 if(a>20 && a<30) {
			 if(a%2==0) {
			 System.out.println("Jerry");
		 }
		 else {
			 System.out.println("Tom");
		 }
	}
}
}
