package com.sept26;
// Rotate the Matrix to Anti-Clock wise by 90 degree.
public class Prb7 {
	
	static void printMatrix(int mat[][]){
		
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
	static void reverseColums(int mat[][]) {
		
		 int n=mat.length;
	}

}
