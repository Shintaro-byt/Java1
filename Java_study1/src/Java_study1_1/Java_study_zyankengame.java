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
		//ユーザーが0か1か2のいずれかの数値を入力したらスキャンする
		int playerNumber=scanner.nextInt();
		//handという変数名にはRPSのindex番号がランダムに入ってる
		String hand =RPS[r.nextInt(3)];
		//ユーザーの選んだじゃんけんの値を出力する
		System.out.println("あなたが選んだのは"+RPS[playerNumber]);
		//相手が選んだじゃんけんの値を出力する
		System.out.println("相手が選んだのは"+hand);
		
		
		
		
		
		
		
		
		
		
		
	}

}
