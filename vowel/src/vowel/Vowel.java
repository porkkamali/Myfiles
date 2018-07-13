package vowel;

import java.util.Scanner;

public class Vowel {
	public static void main(String args[]) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter word");
		String  input = ip.nextLine();
		char[] chars = input.toCharArray();
		try {
			Integer.parseInt(input);
			System.out.println("Not a letter");
		}
		catch(NumberFormatException e) {
		for(int i=0; i <chars.length; i++) {
			  if (chars[i]=='a'||chars[i]=='e'||chars[i]=='i'||chars[i]=='o'|| chars[i]=='u') {
				  System.out.println(chars[i]+"-vowel");
			  }
			  else {
				  System.out.println(chars[i]+ "-constonant");
			  }
		}
		}
		
		
}
}
