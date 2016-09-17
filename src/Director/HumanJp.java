package Director;

public class HumanJp {

	private LangBase langbase;
	
	HumanJp(LangBase langbase){
		this.langbase = langbase;
	}
	
	public String Speak(){
		return this.langbase.Speak();
	}
}
