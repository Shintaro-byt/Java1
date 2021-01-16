package Java_study1_1;

public class Java_study_color {

	public static void main(String[] args) {
		//変数定義
		int maxcolor=8;	//色の数
		String[]colors= {"red","blue","yellow","green",
				"white","black","gray","purple"};//色の種類
		String[]Japanesecolors= {"赤","青","黄","緑",
				"白","黒","灰","紫"};	//色の種類(日本語)
		
		//dayはindex番号0から始まる
		//dayの値が7になるまで
		//dayの値を一つ追加する
		for(int color=0;color<maxcolor;color++)
		{
			System.out.println(Japanesecolors[color]+"は英語で"+colors[color]);
		}

	}

}
