package hello;

public class hello {

	public static void main(String[] args) {
	
		Target target = new Adapter();
		target.targetMethod1();
		target.targetMethod2();
				
	}
	
}
