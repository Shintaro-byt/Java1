package Java_study1_1;

public class Java_study_HW2 {

	public static void main(String[] args) {
	String	name="岸野";
	String	gender="Men";
	double	height=1.76;
	double	weight=64.0;
	double	BMI=weight/(height*2);
	System.out.println("名前:"+name);
	System.out.println("性別:"+gender);
	System.out.println("身長:"+height+"㎝");
	System.out.println("体重:"+weight+"㎏");
	System.out.println("BMI:"+BMI);
	
	if(BMI>25) {
		System.out.println("[肥満]");
	}else if (BMI>=18.5&&BMI<=25) {
		System.out.println("[標準]");
	}else if (BMI<18.5) {
		System.out.println("[低体重]");
	}	
	}	
}