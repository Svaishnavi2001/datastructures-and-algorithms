package com.sept20;
// Reverse the given Array.
public class Problem1 {

	static void reverse(int arr[]) {

		int n=arr.length;
		int start=0;
		int end=n-1;

		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;

			start++;
			end--;
		}
	}
	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50};
		//int arr[]= {50,40,30,20,10}; 

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		reverse(arr);

		System.out.println("---");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");

		}
	}   
}