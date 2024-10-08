package com.matrices;
// Transpose of a Matrix(Swap the Rows to Colms and Colms to Rows).
public class Prb6 {

	static void printMatrix(int mat[][]) {

		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	static void transpose(int mat[][]) {

		int n=mat.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}
	}
	public static void main(String[] args) {

		int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
		//int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		printMatrix(mat);
		System.out.println("");
		transpose(mat);
		printMatrix(mat);

	}

}
