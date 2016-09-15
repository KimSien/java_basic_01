package hello;

public class Buildersuper implements Builder {

	private Carbase carbase;
	
	Buildersuper(){
		this.carbase = new Carbase();
	}

	@Override
	public void name(String name) {
		// TODO Auto-generated method stub
		carbase.setName(name);
	}

	@Override
	public void ability(String ability) {
		// TODO Auto-generated method stub
		carbase.setAbility(ability);
	}

	@Override
	public Carbase getresult() {
		// TODO Auto-generated method stub
		
		return this.carbase;
	}
}
