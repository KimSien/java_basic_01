package Director;

public class LangEn extends LangBase{
	public String langtype;
	
	LangEn(){
		this.langtype = "English";
	}
	
	public String Speak(){
		return this.langtype;
	}
}
