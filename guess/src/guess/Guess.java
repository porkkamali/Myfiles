package guess;

import java.util.Scanner;

public class Guess {
	public static void main(String args[]) {
    int target = 20;
	Scanner ip = new Scanner(System.in);
	System.out.println("Guess target number which is b/w 1-100");
	int n = ip.nextInt();
	if(n > target) {
	System.out.println("Number guessed is more than original number" );
	 }
	else if(n < target) {
	System.out.println("Number guessed is less than original number");
	}
	else {
		System.out.println("Number guessed matches the original number");
	}
  }
}