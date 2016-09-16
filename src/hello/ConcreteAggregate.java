package hello;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate{
	
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public int getSize(){
		return items.size();
	}
	
	public Item getItemAt(int index){
		return (Item) items.get(index);
	}
	
	public Iterator iterator(){
		return new ConcreteIterator(this);
	}
	
	

	
	
}
