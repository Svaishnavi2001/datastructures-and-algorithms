package com.arrays;

// /Insert the Element at given position in an Array.

public class Lab5 {

	static int insert(int arr[],int element,int position) {

		int n=arr.length;
		int index=position-1;

		for(int i=n-1;i>index;i--) {
			arr[i]=arr[i-1]	;
		}
		arr[index]=element;
		return n+1;
	}
	public static void main(String[] args) {

		int arr[]=new int[6];
		arr[0]=	10;
		arr[1]=	20;
		arr[2]=	30;
		arr[3]=	40;
		arr[4]=	50;

		int element=60;
		int position=3;

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println();

		insert(arr,element,position);

		System.out.println("-----");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
