package hello;

public class hello {

	public static void main(String[] args) {
		
		peaple peaples = new peaple();
		
		//japan
		JapaneseState japan = new JapaneseState();		
		peaples.ChangeState(japan);		
		System.out.println(peaples.hello());

		//english
		EnglishState englishs = new EnglishState();		
		peaples.ChangeState(englishs);		
		System.out.println(peaples.hello());
		
		
		
	}

	
	
}
