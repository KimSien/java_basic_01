package Director;

public class ConcreateBase implements CloneBase {

	public String name;
	
	public ConcreateBase(){}
	public ConcreateBase(String name){
		this.name = name;
	}
	
	@Override
	public CloneBase createClone() {
		ConcreateBase newConcreateBase = new ConcreateBase();
		newConcreateBase.name = this.name;
		return newConcreateBase;
	}
	
	
	
}
