package Java_study1_1;

public class Java_study_age {

	public static void main(String[] args) {
		//�ϐ���`
		int age=49;
		//�Q�O�Ζ����͖����N�ƕ\������
		if(age<20) {
		   System.out.println("�����N");
		//�Q�O�`�Q�X�΂܂ł͂Q�O��ƕ\������
		}else if(age>=20&&age<=29) {
			System.out.println("�Q�O��");
		//30�`�R�X�΂܂ł͂R�O��ƕ\������	
		}else if(age>=30&&age<=39) {
			System.out.println("�R�O��");
		//�S�O�`�S�X�΂܂ł͂S�O��ƕ\������	
		}else if(age>=40&&age<=49) {
			System.out.println("�S�O��");
		}
		
		
		

	}

}
