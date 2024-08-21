package com.matrices;
// Sum of Diagonals Elements of n*n Matrix.
public class Prb3A {

	public static void main(String[] args) {

		  int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
		//int mat[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		int n=mat.length;
		int sum=0;

		// Main diagonal
		for(int i=0;i<n;i++) {
			sum=sum+mat[i][i];
		}
		// Secondary diagonal
		for(int i=0,j=n-1;i<n;i++,j--) {
			if(i!=j) {
				sum=sum+mat[i][j];
			}
		}
		System.out.println("Sum is:"+ sum);
	}
}
