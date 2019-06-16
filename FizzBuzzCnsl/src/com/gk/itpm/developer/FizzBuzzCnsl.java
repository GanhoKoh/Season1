package com.gk.itpm.developer;

public class FizzBuzzCnsl {

	public static void main(String[] args) {

		for(int i = 1; i <= 100; i++) {

			//3でも5でも割り切れるとき
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
				continue;
			}

			//3で割り切れるとき
			if(i % 3 == 0) {
				System.out.println("Fizz");
				continue;
			}

			//5で割り切れるとき
			if(i % 5 == 0) {
				System.out.println("Buzz");
				continue;
			}

			//それ以外はそのまま出力
			System.out.println(i);
		}

	}

}
