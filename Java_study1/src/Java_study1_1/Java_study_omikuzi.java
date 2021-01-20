package Java_study1_1;

import java.util.Random;
import java.util.Scanner;


public class Java_study_omikuzi {

	public static void main(String[] args) {
		//配列宣言
		String[] omikuzi = {"大吉","吉","中吉","小吉","凶"};		
		//Scannerクラスの準備
		Scanner scanner=new Scanner(System.in);
		//Randamクラスの準備
		Random Ran=new Random();
		
		//入力を促すメッセージ
		System.out.println("あなたの今日のおみくじを引きます。");
		System.out.println("あなたの名前は？");
		//ユーザーが名前を入力するので入力した値をスキャンする
		String input_name=scanner.nextLine();
		//answerという変数名にはanswerのindex番号がランダムに入ってる
		String omikuziResult=omikuzi[Ran.nextInt(5)];
		
		//入力された内容を画面に表示
		System.out.println(input_name+"の今日のおみくじの結果は..."+omikuziResult);
		//Scannerクラスのインスタンスをクローズ
		scanner.close();
								
		

	}

}
