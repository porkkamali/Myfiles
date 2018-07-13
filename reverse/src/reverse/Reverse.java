package reverse;
import java.util.Scanner;
public class Reverse {
		public static void main(String args[]) {
			Scanner ip = new Scanner(System.in);
			System.out.println("Enter any string");
			String  input = ip.nextLine();
			for(int i=input.length()-1;i>=0;i--) {
			System.out.print(input.charAt(i));
			}
		}
}
