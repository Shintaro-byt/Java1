package Java_study1_1;

import java.util.Random;

public class Java_study_Random {

	public static void main(String[] args) {
		//�z��錾
		String[] hands = {"�O�[","�`���L","�p�["};
		//Randomclass�̐ݒ������
		Random r = new Random();
		//hand�Ƃ����ϐ����ɂ�hand��index�ԍ��������_���ɓ����Ă�
		String hand =hands[r.nextInt(3)];
		//�����_���ň����o����index�ԍ������Ƃɏo��
		System.out.println(hand);
		
	}
}
