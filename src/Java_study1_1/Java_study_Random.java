package Java_study1_1;

import java.util.Random;

public class Java_study_Random {

	public static void main(String[] args) {
		//配列宣言
		String[] hands = {"グー","チョキ","パー"};
		//Randomclassの設定をする
		Random r = new Random();
		//handという変数名にはhandのindex番号がランダムに入ってる
		String hand =hands[r.nextInt(3)];
		//ランダムで引き出したindex番号をもとに出力
		System.out.println(hand);
		
	}
}
