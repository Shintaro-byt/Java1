package Java_study1_1;

import java.util.Random;
import java.util.Scanner;


public class Java_study_omikuzi {

	public static void main(String[] args) {
		//�z��錾
		String[] omikuzi = {"��g","�g","���g","���g","��"};		
		//Scanner�N���X�̏���
		Scanner scanner=new Scanner(System.in);
		//Randam�N���X�̏���
		Random Ran=new Random();
		
		//���͂𑣂����b�Z�[�W
		System.out.println("���Ȃ��̍����̂��݂����������܂��B");
		System.out.println("���Ȃ��̖��O�́H");
		//���[�U�[�����O����͂���̂œ��͂����l���X�L��������
		String input_name=scanner.nextLine();
		//answer�Ƃ����ϐ����ɂ�answer��index�ԍ��������_���ɓ����Ă�
		String omikuziResult=omikuzi[Ran.nextInt(5)];
		
		//���͂��ꂽ���e����ʂɕ\��
		System.out.println(input_name+"�̍����̂��݂����̌��ʂ�..."+omikuziResult);
		//Scanner�N���X�̃C���X�^���X���N���[�Y
		scanner.close();
								
		

	}

}
