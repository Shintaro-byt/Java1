package Java_study1_1;

public class Java_study_color {

	public static void main(String[] args) {
		//�ϐ���`
		int maxcolor=8;	//�F�̐�
		String[]colors= {"red","blue","yellow","green",
				"white","black","gray","purple"};//�F�̎��
		String[]Japanesecolors= {"��","��","��","��",
				"��","��","�D","��"};	//�F�̎��(���{��)
		
		//day��index�ԍ�0����n�܂�
		//day�̒l��7�ɂȂ�܂�
		//day�̒l����ǉ�����
		for(int color=0;color<maxcolor;color++)
		{
			System.out.println(Japanesecolors[color]+"�͉p���"+colors[color]);
		}

	}

}
