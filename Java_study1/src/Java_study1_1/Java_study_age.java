package Java_study1_1;

public class Java_study_age {

	public static void main(String[] args) {
		//変数定義
		int age=49;
		//２０歳未満は未成年と表示する
		if(age<20) {
		   System.out.println("未成年");
		//２０〜２９歳までは２０代と表示する
		}else if(age>=20&&age<=29) {
			System.out.println("２０代");
		//30〜３９歳までは３０代と表示する	
		}else if(age>=30&&age<=39) {
			System.out.println("３０代");
		//４０〜４９歳までは４０代と表示する	
		}else if(age>=40&&age<=49) {
			System.out.println("４０代");
		}
		
		
		

	}

}
