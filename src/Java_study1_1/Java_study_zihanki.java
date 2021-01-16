package Java_study1_1;

public class Java_study_zihanki {

	public static void main(String[] args) {
	int money=160;
	if(money==160) {
		System.out.println("ドリンクが購入できました[お釣りなし]");
	}else if (money>160) {
		System.out.println("ドリンクが購入できました[お釣りあり]");
	}else if (money<160) {
		System.out.println("金額が足りません");
	}

	}

}
