package Java_study1_1;

public class Java_HW_testscore {

	public static void main(String[] args) {
		//�y���K�z�ϐ���`�����ĕ\���������Ă݂܂��傤�B
		//String�^�@�ϐ�����Student_name�@�����l"�c��"
		String	Student_name="�c��";
		//int�^�@�ϐ�����japanese_score �����l85
		int	japanese_score=85;
		//int�^�@�ϐ�����math_score �����l66
		int	math_score=66;
		//����̓_�����u�c������̍���̓_����85�_�ł��B�v�ƕ\��������
		System.out.println(Student_name+"����̍���̓_����"+japanese_score+"�_�ł��B");
		//���w�̓_�����u�c������̐��w�̓_����66�_�ł��B�v�ƕ\��������
		System.out.println(Student_name+"����̐��w�̓_����"+math_score+"�_�ł��B");
		//double�^�ŕϐ�����avarage_score�Ƃ��A����Ɛ��w�̕��ϒl���v�Z���A�u�c������̕��ϓ_�́����_�ł��B�v�ƕ\��������
		double	avarage_score=(japanese_score+math_score)/2;
		System.out.println("�c������̕��ϓ_��"+avarage_score+"�_�ł��B");
		//���ϓ_��70�_�𒴂����獇�i�A70�_�����ł���Εs���i��\��������
		if (avarage_score>70.0){
		System.out.println("���i�ł��B");
		}else{
		System.out.println("�s���i�ł��B");
		
		}

	}

}
