package noninteger;
import java.util.*;
public class Noninteger {
	public static void main(String args[])
    {
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter those elements");
        n=sc.nextInt();
        try {
        int[] a=new int[n];
        for(int i = 0; i < n; i++)
        {
           a[i] = sc.nextInt();
          sum = sum+a[i];
        }
        System.out.println("Sum:"+sum);
		}
	catch(Exception ex) {
		 System.out.println("Not an integer");
         }
    }     
}

