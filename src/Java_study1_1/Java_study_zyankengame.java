package Java_study1_1;

import java.util.Random;
import java.util.Scanner;

public class Java_study_zyankengame {

	private static String[] hands;

	public static void main(String[] args) {
		//Scanner�N���X�̏���
		Scanner scanner=new Scanner(System.in);
		//Random�N���X�̏���
		Random r=new Random();
		//hand�Ƃ����ϐ����ɂ�hand��index�ԍ��������_���ɓ����Ă�
		String hand =hands[r.nextInt(3)];
				
		//�z��錾
		String[] RPS= {"�O�[","�`���L","�p�["};
		
		//���͂𑣂����b�Z�[�W
		System.out.println("����񂯂�Q�[�������悤�I");
		System.out.println("���Ȃ��̂����O�́H");
		//���[�U�[�����O����͂������O���X�L��������
		String playerName=scanner.nextLine();
		//���[�U�[�����͂������O���o�͂���
		System.out.println(playerName+"����ł��ˁB");
		//���[�U�[�ɂ���񂯂�̒l��I��ł��炤
		System.out.println("��(0:,�O�[/1:�`���L/2:�p�[)�̂ǂꂩ��I��ł�������");
		
		for(int i=1;i<=3;i++) {
			System.out.println(i+"����")�G
		}
		
		
		
		
		
		
		
		
		
	}

}
