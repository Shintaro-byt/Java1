package Java_study1_1;

import java.util.Random;
import java.util.Scanner;

public class Java_study_tenki {
	

	public static void main(String[] args) {
		//配列宣言
		String[] tenki= {"晴れ","雨","くもり","雪"};
		//Scanneｒクラスの準備
		Scanner scanner=new Scanner(System.in);
		//Randomクラスの準備
		Random Ran=new Random();
		
		//入力を促すメッセージ
		System.out.println("好きな市を入れて、");
		//ユーザーが市の名前を入力するので入力した値をスキャンする
		String input_cityName=scanner.nextLine();
		//tenliResltという変数名にはtenkiのindex番号がランダムに入っている
		String tenkiResult=tenki[Ran.nextInt(4)];
		//入力された内容を画面に表示
		System.out.println(input_cityName+"の今日の天気は"+tenkiResult);
		//Scannerクラスのインスタンスをクローズ
		scanner.close();
				
		
		

	}

}
