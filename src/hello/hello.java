package hello;

public class hello {

	public static void main(String[] args) {
		System.out.println("base");	
		
		ConcreteAggregate a = new ConcreteAggregate();
		a.addItem(new Item("A"));
		a.addItem(new Item("B"));
		a.addItem(new Item("C"));
		a.addItem(new Item("D"));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            System.out.println(item.getName());
        }
		
		
	}
	
}
