package com.gk.itpm.developer;

import java.util.ArrayList;

public class ITPMDEveloperNameList {

	public static void main(String[] args) {

		//格納するデータを用意
		ArrayList<String> developersNameList = new ArrayList<String>();

		//開発チームの名前を初期化する
		String[] developersNameArray = {  "相田 管人" , "境 拓也", "開発 太郎" };

		//ArrayListにまずは値が入っていないことを確認
		for(String name : developersNameList) {
			System.out.println(name);
		}

		//for文を使って配列の人物をaddしていく
		for(String name : developersNameArray) {
			//追加するのはaddメソッドを使う
			developersNameList.add(name);
		}

		//追加されてたか確認してみる
		for(String name : developersNameList) {
			System.out.println(name);
		}

		//次に自分の名前を宣言する
		String myName = "黄 顔甫";

		//addを使って追加する
		developersNameList.add(myName);

		//最後に追加されたか確認する
		for(String name : developersNameList) {
			System.out.println(name);
		}

		//相田管人が開発チームを離れたので削除するremoveを使う
		developersNameList.remove("相田 管人");

		//またまた表示してみる
		for(String name : developersNameList) {
			System.out.println(name);
		}

		developersNameList.add("hoge");
		developersNameArray.add("hoge");



	}

}
