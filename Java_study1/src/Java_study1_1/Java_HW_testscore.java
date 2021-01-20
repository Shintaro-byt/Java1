package Java_study1_1;

public class Java_HW_testscore {

	public static void main(String[] args) {
		//【復習】変数定義をして表示をさせてみましょう。
		//String型　変数名はStudent_name　初期値"田中"
		String	Student_name="田中";
		//int型　変数名はjapanese_score 初期値85
		int	japanese_score=85;
		//int型　変数名はmath_score 初期値66
		int	math_score=66;
		//国語の点数を「田中さんの国語の点数は85点です。」と表示させる
		System.out.println(Student_name+"さんの国語の点数は"+japanese_score+"点です。");
		//数学の点数を「田中さんの数学の点数は66点です。」と表示させる
		System.out.println(Student_name+"さんの数学の点数は"+math_score+"点です。");
		//double型で変数名をavarage_scoreとし、国語と数学の平均値を計算し、「田中さんの平均点は●●点です。」と表示させる
		double	avarage_score=(japanese_score+math_score)/2;
		System.out.println("田中さんの平均点は"+avarage_score+"点です。");
		//平均点が70点を超えたら合格、70点未満であれば不合格を表示させる
		if (avarage_score>70.0){
		System.out.println("合格です。");
		}else{
		System.out.println("不合格です。");
		
		}

	}

}
