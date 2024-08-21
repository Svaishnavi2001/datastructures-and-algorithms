package com.arrays;

// Find whether the Array is Sorted in ASC or Not.

public class Problem4 {

	static boolean isSorted (int arr[]) //parameters int arr[] //return type:boolean
	{

		int n=arr.length;

		for(int i=1;i<n;i++) {
			if(arr[i-1]>arr[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		//int arr[]= {10,20,30,50,40};
		int arr[]= {10,20,30,40,50};

		boolean flag=isSorted(arr);
		if(flag)
			System.out.println("Yes Sorted");
		else
			System.out.println("Not Sorted");

	}
}
