package com.gk.itpm.develop.numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Random random = new Random();
		int randomNum = random.nextInt(10);

		Scanner sc = new Scanner(System.in);

		System.out.println("1～10までの数値を入力して下さい。");
		for(int i = 0; i < 3; i++) {
			//入力を促す
			int inputNum = inputNumber(sc);

			//もし外れたら場合
			if(inputNum != randomNum) {
				System.out.println("残念。。外れです。");
				if(i != 2) {
					showHint(randomNum, inputNum);
				} else {
					break;
				}
			}

			//当たりの場合
			if(inputNum == randomNum) {
				System.out.println("大正解！！おめでとうございます。");
				return;
			}
		}

		System.out.println("残念。。正解できませんでした。");
	}

	static int inputNumber(Scanner sc) {
		return sc.nextInt();
	}

	static void showHint(int randomNum, int inputNum) {
		if(randomNum > inputNum) {
			System.out.println("もう少し大きい数値ですよ！");
		} else {
			System.out.println("もう少し小さい数値ですよ！");
		}
	}
}
