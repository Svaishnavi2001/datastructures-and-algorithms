package com.sept21;

// Rotate the Elements Left side K times.

public class Problem6A {
	
	static void leftRotateOne(int arr[]) {
		
		int n=arr.length;
		int temp=arr[0];
		
		for(int i=1;i<n;i++) {
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
	}
	static void leftRotate(int arr[],int k) {
		
		for(int i=1;i<k;i++) {
			leftRotateOne(arr);
		}
		
  }
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
	    int k=4;

	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    
	    leftRotate(arr,k);
	    System.out.println();
	    
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }

  }
}