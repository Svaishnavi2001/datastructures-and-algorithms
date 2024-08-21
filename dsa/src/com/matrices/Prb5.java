package com.matrices;
// Reverse the Rows of a Matrix.
public class Prb5 {

	static void printMatrix(int mat[][]){

		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println("");
		}

	}
	static void reverseRows(int mat[][]) {

		int n=mat.length;
		for(int i=0;i<n;i++) {
			int start=0;
			int end=n-1;
			while(start<end) {
				int temp=mat[i][start];
				mat[i][start]=mat[i][end];
				mat[i][end]=temp;

				start++;
				end--;
			}
		}
	}
	public static void main(String[] args) {

		int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
		// int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		printMatrix(mat);
		System.out.println(" ");
		reverseRows(mat);
		printMatrix(mat);

	}








}
