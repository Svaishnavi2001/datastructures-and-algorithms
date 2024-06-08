package com.assign;

import java.util.Scanner;
public class Ary2 {
	public static void main(String[] args) {

		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the age of 1st student");
		a[0]=sc.nextInt();

		System.out.println("Enter the age of 2nd student");
		a[1]=sc.nextInt();

		System.out.println("Enter the age of 3rd student");
		a[2]=sc.nextInt();

		System.out.println("Enter the age of 4th student ");
		a[3]=sc.nextInt();

		System.out.println("Enter the age of 5th student ");
		a[4]=sc.nextInt();

		System.out.print(a[0]+" ");
		System.out.print(a[1]+" ");
		System.out.print(a[2]+" ");
		System.out.print(a[3]+" ");
		System.out.print(a[4]+" ");
	}
}
