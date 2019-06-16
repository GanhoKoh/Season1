package com.gk.itpm.developer;

import java.util.Scanner;

public class Oumugaeshi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean isNotExit = true;
		do {
			String str = sc.nextLine();

			if(!"exit".equals(str)) {
				System.out.println(str);
			} else {
				isNotExit = false;
			}
		} while (isNotExit);

		sc.close();
	}

}
