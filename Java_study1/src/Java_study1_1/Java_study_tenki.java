package Java_study1_1;

import java.util.Random;
import java.util.Scanner;

public class Java_study_tenki {
	

	public static void main(String[] args) {
		//�z��錾
		String[] tenki= {"����","�J","������","��"};
		//Scanne���N���X�̏���
		Scanner scanner=new Scanner(System.in);
		//Random�N���X�̏���
		Random Ran=new Random();
		
		//���͂𑣂����b�Z�[�W
		System.out.println("�D���Ȏs�����āA");
		//���[�U�[���s�̖��O����͂���̂œ��͂����l���X�L��������
		String input_cityName=scanner.nextLine();
		//tenliReslt�Ƃ����ϐ����ɂ�tenki��index�ԍ��������_���ɓ����Ă���
		String tenkiResult=tenki[Ran.nextInt(4)];
		//���͂��ꂽ���e����ʂɕ\��
		System.out.println(input_cityName+"�̍����̓V�C��"+tenkiResult);
		//Scanner�N���X�̃C���X�^���X���N���[�Y
		scanner.close();
				
		
		

	}

}
