package hello;

public class ConcreteIterator implements Iterator {

	private ConcreteAggregate concreteAggregate;
	private int index = 0;
	
	
	
	public ConcreteIterator(ConcreteAggregate concreteAggregate){
		this.concreteAggregate = concreteAggregate;
	}
	
	public boolean hasNext(){
		if(index < concreteAggregate.getSize()){
			return true;
		}else{
			return false;
		}
	}
	
	public Object next(){
		return concreteAggregate.getItemAt(index++);
	}
	
}
