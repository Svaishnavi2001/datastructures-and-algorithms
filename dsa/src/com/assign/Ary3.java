package com.assign;
import java.util.Scanner;
public class Ary3 {

	public static void main(String[] args) {

		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<=4;i++) {
			System.out.println("Enter the age of "+(i+1)+" student");
			a[i]=sc.nextInt();
		}

		System.out.println("The ages are: ");
		for(int j=0;j<=4;j++) {
			System.out.println(a[j]+" ");
		}
	}

}
