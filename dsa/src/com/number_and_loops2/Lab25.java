package com.number_and_loops2;

// WAP to display the strong numbers from m to n. 

public class Lab25 {
	
private static int factorial(int num) {
		
		int fact=1;
		for(int i=2;i<=num;i++) {
			fact=fact*i;
		}
	         return fact;
	}
      private  static boolean isStrong(int num){
    	  
    	  int sum=0;
    	  int numCopy=num;
    	  while(num!=0) {
    		  int digit=num%10;
    		  sum=sum+factorial(digit);
    		  num=num/10;
    	  }
    	      if(sum==numCopy) 
    		    return true;
    		 else
    			 return false;
    	 
      }
       public static void main(String[] args) {
	 
	           int m=1;
	     	   int n=1000;
	     	   for(int k=m;k<=n;k++) {
	     		   
	     		if(isStrong(k)) {
	     			System.out.println(k);
	     		}
	     	   }
 }

}
