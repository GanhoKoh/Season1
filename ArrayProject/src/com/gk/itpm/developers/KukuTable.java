package com.gk.itpm.developers;

public class KukuTable {

	public static void main(String[] args) {

		int[][] kukuArray = new int[9][9];

		for(int i = 1; i <= 9; i++ ) {
			for(int j = 1; j <= 9; j++) {
				kukuArray[(i - 1)][(j - 1)] = i * j;
			}
		}

		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.printf("%d", kukuArray[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
