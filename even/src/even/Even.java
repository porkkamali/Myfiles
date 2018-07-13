package even;

import java.util.*;

public class Even {
 public static void main(String args[]) {
	 Scanner ip = new Scanner(System.in);
	 System.out.println("Enter a number");
	 long a = ip.nextInt();
	 long r,sum=0,sum1=0,temp,n;   
	 temp = a;   
	 while(a>0){    
	   r=a%10;  
	   sum=(sum*10)+r;    
	   a=a/10;  
	  }
	  if(temp==sum) {
          while(temp>0) {
          n = temp % 10;
          if(n%2==0){
			 sum1=sum1+n; 
	      }
          temp=temp/10;
          }
          if(sum1>25) {
        	System.out.println(+sum+" is palindrome and sum is greater than 25");
          }
	      else {
		  System.out.println(+sum+ "is palindrome and sum is less than 25");
	     }
      }
	  else{
	        	System.out.println(+sum+ " is not palindrome");
	  }
	  
 }
}
