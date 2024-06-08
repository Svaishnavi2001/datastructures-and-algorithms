package com.sept20;
// Remove the Duplicates from sorted Array.
public class Problem2 {

	static int removeDuplicates(int arr[]) {

		int n=arr.length;
		int temp=1;

		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[temp-1]) {
				arr[temp]=arr[i];
				temp++;
			}
			arr[i]=0;
		}
		return temp;
	}
	public static void main(String[] args) {

		int arr[]= {10,10,20,20,20,30,40,40,40};
		//int arr[]= {10,20,30,40,0,0,0,0,0};

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

		System.out.println();
		int newlength= removeDuplicates(arr);	

		for(int i=0;i<newlength;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
