package hello;

public class peaple {

	private State state = null;
	
	public void ChangeState(State state){
		this.state = state;
	}
	
	public String hello(){
		return this.state.hello();
	}
}
