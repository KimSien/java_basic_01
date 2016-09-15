package hello;

public class Carsupercar {

	private Builder builder;
	
	
	Carsupercar(Builder builder){
		this.builder =  builder;
	}
	
	void construct(){
		builder.name("super car desu");
		builder.ability("jisoku 100 km demasu");
	}
	
}
