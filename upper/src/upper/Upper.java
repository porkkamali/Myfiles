package upper;

import java.util.Scanner;

public class Upper {
	public static void main(String args[]) {
		Scanner ip = new Scanner(System.in);
		 System.out.println("Enter a character");
		 char ch = ip.next().charAt(0);
		 if(Character.isUpperCase(ch)) {
			 System.out.println("Capital letter");
		 }
		 else if(Character.isLowerCase(ch)) {
			 System.out.println("Small letter");
		 }
		 else if(Character.isDigit(ch)) {
			 System.out.println("Digit");
		 }
		 else {
			 System.out.println("Special character");
		 }
	}
}