package Director;

public class Director {

	public static void main(String[] args) {
		
		LangJp langjp = new LangJp();
		HumanJp humanJp = new HumanJp(langjp);
		
		System.out.println(humanJp.Speak());
	
		//another pattern HumanEn(not use)
		// if class extends tolk about **
		
		HumanJpTranslate humanJpTranslate = new HumanJpTranslate(langjp);
		System.out.println(humanJpTranslate.translate());
						
	}
}
