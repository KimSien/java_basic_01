package hello;

public class Adapter extends Adaptee implements Target {

	
	public void targetMethod1(){
		method1();
	}

	public void targetMethod2(){
		method2();
	}
	
}
