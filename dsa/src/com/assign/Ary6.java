package com.assign;
import java.util.Scanner;
public class Ary6 {

	public static void main(String[] args) {

		int a[][]=new int[2][5];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<=1;i++) {
			for(int j=0;j<=4;j++) {
				System.out.println("Enter the age of class "+(i+1)+"student "+(j+1));
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The ages of students are: ");
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}