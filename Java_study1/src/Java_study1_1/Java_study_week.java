package Java_study1_1;

public class Java_study_week {

	public static void main(String[] args) {
		//変数定義	
		int maxDays=7;	//1週間の日数
		String[]days= {"Sunday","Monday","Tuesday","Wednesday",
				"Thursday","Friday","Saturday"};	//曜日の英単語
		String[]Japanesedays= {"日曜日","月曜日","火曜日","水曜日",
				"木曜日","金曜日","土曜日"};	//日本語の曜日
		
		//day=0はindex番号0番から始まる
		//dayの値が6になるまで(maxDayの値が7のため7未満)
		//dayの値を一つ追加する
		for(int day=0;day<maxDays;day++)
		{
			System.out.println(Japanesedays[day]+"は英語では"+days[day]+"です");
		}

	}

}
