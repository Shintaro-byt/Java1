package Java_study1_1;

public class Java_study_HW2 {

	public static void main(String[] args) {
	String	name="�ݖ�";
	String	gender="Men";
	double	height=1.76;
	double	weight=64.0;
	double	BMI=weight/(height*2);
	System.out.println("���O:"+name);
	System.out.println("����:"+gender);
	System.out.println("�g��:"+height+"�p");
	System.out.println("�̏d:"+weight+"�s");
	System.out.println("BMI:"+BMI);
	
	if(BMI>25) {
		System.out.println("[�얞]");
	}else if (BMI>=18.5&&BMI<=25) {
		System.out.println("[�W��]");
	}else if (BMI<18.5) {
		System.out.println("[��̏d]");
	}	
	}	
}