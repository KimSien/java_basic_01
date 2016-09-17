package hello;

public class SingletonBase {

	private static SingletonBase singletonBase = new SingletonBase();
	
	private SingletonBase(){}
	
	public static SingletonBase getinstance(){
		return singletonBase;
	}
	
}
