package com.arrays;

public class Lab1 {

	public static void main(String[] args) {

		//1. Create Array
		int arr[]=new int[5];

		// 2. Length of Array
		int n= arr.length;
		System.out.println(n);

		//3. Access Elements ofE Array
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

		//4. Initialize the Array
		arr[0]=11;
		arr[2]=22;
		arr[4]=44;

        // Access the Elements of Array		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);

		}

	}

}
