package Java_study1_1;

public class Java_study_week {

	public static void main(String[] args) {
		//�ϐ���`	
		int maxDays=7;	//1�T�Ԃ̓���
		String[]days= {"Sunday","Monday","Tuesday","Wednesday",
				"Thursday","Friday","Saturday"};	//�j���̉p�P��
		String[]Japanesedays= {"���j��","���j��","�Ηj��","���j��",
				"�ؗj��","���j��","�y�j��"};	//���{��̗j��
		
		//day=0��index�ԍ�0�Ԃ���n�܂�
		//day�̒l��6�ɂȂ�܂�(maxDay�̒l��7�̂���7����)
		//day�̒l����ǉ�����
		for(int day=0;day<maxDays;day++)
		{
			System.out.println(Japanesedays[day]+"�͉p��ł�"+days[day]+"�ł�");
		}

	}

}
