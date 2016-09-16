package hello;

public abstract class sMath {

	public abstract int First();
	
	public abstract int Second();
	
	public void aggregate(){
		
		int first = First();
		int second = Second();
	
		System.out.println(first+second);
	
	}
}
