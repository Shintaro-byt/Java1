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
		//���[�U�[��0��1��2�̂����ꂩ�̐��l����͂�����X�L��������
		int playerNumber=scanner.nextInt();
		//hand�Ƃ����ϐ����ɂ�RPS��index�ԍ��������_���ɓ����Ă�
		String hand =RPS[r.nextInt(3)];
		//���[�U�[�̑I�񂾂���񂯂�̒l���o�͂���
		System.out.println("���Ȃ����I�񂾂̂�"+RPS[playerNumber]);
		//���肪�I�񂾂���񂯂�̒l���o�͂���
		System.out.println("���肪�I�񂾂̂�"+hand);
		
		
		
		
		
		
		
		
		
		
		
	}

}
