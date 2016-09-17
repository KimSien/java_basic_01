package Director;

public class LangJp extends LangBase{
	public String langtype;

	LangJp(){
		this.langtype = "japanease";
	}
	
	public String Speak(){
		return this.langtype;
	}

}
