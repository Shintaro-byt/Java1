package Java_study1_1;

import java.util.Random;
import java.util.Scanner;

public class Java_study_zyankengame {

	private static String[] hands;

	public static void main(String[] args) {
		//Scannerクラスの準備
		Scanner scanner=new Scanner(System.in);
		//Randomクラスの準備
		Random r=new Random();
		//handという変数名にはhandのindex番号がランダムに入ってる
		String hand =hands[r.nextInt(3)];
				
		//配列宣言
		String[] RPS= {"グー","チョキ","パー"};
		
		//入力を促すメッセージ
		System.out.println("じゃんけんゲームをしよう！");
		System.out.println("あなたのお名前は？");
		//ユーザーが名前を入力した名前をスキャンする
		String playerName=scanner.nextLine();
		//ユーザーが入力した名前を出力する
		System.out.println(playerName+"さんですね。");
		//ユーザーにじゃんけんの値を選んでもらう
		System.out.println("手(0:,グー/1:チョキ/2:パー)のどれかを選んでください");
		
		for(int i=1;i<=3;i++) {
			System.out.println(i+"回戦目")；
		}
		
		
		
		
		
		
		
		
		
	}

}
