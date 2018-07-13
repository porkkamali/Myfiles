package stackroute;
import java.util.Scanner;
public class Stackroute {
	 public static void main(String args[])
	    {
	        String str,rep;
	        int n;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter a string");
	        str=sc.nextLine();
	        //System.out.println(str);
	        System.out.println("enter a number");
	        n=sc.nextInt();
	        
	        
	        int x=str.length();
	        int y=x-n;
	        for(int i=0;i<x;i++)
	        {
	            System.out.print(str.charAt(i));
	            
	        }

	        for(int i=y;i<x;i++)
	        {
	            
	            for(int g=y;g<x;g++)
	            {
	                System.out.print(str.charAt(g));
	            }
	        }
	    }
	    
}
