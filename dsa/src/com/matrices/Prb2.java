package com.matrices;
// Print the Secondary Diagonls of n*n Matrix,
public class Prb2 {

	public static void main(String[] args) {


		int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};

		int n=mat.length;
		for(int i=0,j=n-1;i<n;i++,j--) {
			System.out.println(mat[i][j]+"\t");
		}


	}

}
