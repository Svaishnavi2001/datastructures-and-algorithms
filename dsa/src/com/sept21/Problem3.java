package com.sept21;
// Move all Zeros to Last.
public class Problem3 {

	static int moveZeros(int arr[]) {

		int n=arr.length;
		int temp=0;

		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {

				int x=arr[i];
				arr[i]=arr[temp];
				arr[temp]=x;

				temp++;
			}
		}

		return temp;
	}
	public static  void main(String[] args) {

		int arr[]= {10,15,0,0,25,0,20};
		// int arr[]= {10,15,25,20,0,0,0};

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		int nonZeroCount=moveZeros(arr);

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();

		for(int i=0;i<nonZeroCount;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}