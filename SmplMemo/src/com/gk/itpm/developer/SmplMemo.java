package com.gk.itpm.developer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmplMemo {

	public static void main(String[] args) {
		List<String> memoList = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		System.out.println("MemoMemo......");

		boolean isExit = false;
		do {
			String memo = sc.nextLine();
			if("exit".compareToIgnoreCase(memo) == 0) {
				System.out.println("EXITが入力されたので終了します。");
				isExit = true;
			} else {
				memoList.add(memo);
			}
		} while(!isExit);

		for(String memo : memoList) {
			System.out.println(memo);
		}

		sc.close();
	}
}
