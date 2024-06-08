package com.assign;

import java.util.Scanner;
public class Ary4 {

	public static void main(String[] args) {

		boolean a[]=new boolean[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=4;i++) {
			System.out.println("Enter the marriage status");
			a[i]=sc.nextBoolean();
		}

		System.out.println("The marriage status:");
		for(int j=0;j<=4;j++) {
			System.out.println(a[j]+" ");
		}
	}
}
