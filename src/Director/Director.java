package Director;

public class Director {

	public static void main(String[] args) {
		
		ConcreateBase ProtoBase = new ConcreateBase("‚±‚ê‚ğƒRƒs[");
		
		ConcreateBase[] copyToBase = new ConcreateBase[20];

		for(int n=0; n < copyToBase.length; n++){
			copyToBase[n] = (ConcreateBase)ProtoBase.createClone();
			System.out.println(copyToBase[n].name);
		}
		
		//System.out.println("base");	
	}
	
}
