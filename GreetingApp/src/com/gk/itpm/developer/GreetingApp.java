package com.gk.itpm.developer;

public class GreetingApp {

	public static void main(String[] args) {

		//雛形メッセージを作成する
		String greeting =
				"私の名前は%sです。私の好きなものは%sです。成人式を迎えて%d年過ぎました。";


		String name = "黄　顔甫";
		String myFavorite  = "湯豆腐";
		int age = 35;

		String greetingMsg = String.format(greeting, name, myFavorite, age - 20);

		System.out.println(greetingMsg);

	}

}
