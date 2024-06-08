package com.sept9;

public class Prog4 {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=40;
		int max=0;
				
		if(a>b&&a>c) 
			
			max=a;
		
		else if(b>a&&b>c)
			
		    max=b;
		
		else 
			
			max=c;
		
		
		System.out.println("Max is:" +max);
	}

}
