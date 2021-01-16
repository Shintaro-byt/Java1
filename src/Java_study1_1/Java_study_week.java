package Java_study1_1;

public class Java_study_week {

	public static void main(String[] args) {
		//•Ï”’è‹`	
		int maxDays=7;	//1TŠÔ‚Ì“ú”
		String[]days= {"Sunday","Monday","Tuesday","Wednesday",
				"Thursday","Friday","Saturday"};	//—j“ú‚Ì‰p’PŒê
		String[]Japanesedays= {"“ú—j“ú","Œ—j“ú","‰Î—j“ú","…—j“ú",
				"–Ø—j“ú","‹à—j“ú","“y—j“ú"};	//“ú–{Œê‚Ì—j“ú
		
		//day=0‚Íindex”Ô†0”Ô‚©‚çn‚Ü‚é
		//day‚Ì’l‚ª6‚É‚È‚é‚Ü‚Å(maxDay‚Ì’l‚ª7‚Ì‚½‚ß7–¢–)
		//day‚Ì’l‚ğˆê‚Â’Ç‰Á‚·‚é
		for(int day=0;day<maxDays;day++)
		{
			System.out.println(Japanesedays[day]+"‚Í‰pŒê‚Å‚Í"+days[day]+"‚Å‚·");
		}

	}

}
