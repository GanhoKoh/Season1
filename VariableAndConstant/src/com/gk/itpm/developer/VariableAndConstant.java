package com.gk.itpm.developer;

public class VariableAndConstant {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name = "黄　顔甫";
		int age = 35;

		String message = "私の名前は%sです。年齢は%dです。\r\n" +
						  "成人式を経て、%d年過ぎました。";

		System.out.println(String.format(message, name, age, age - 20));

	}

}
