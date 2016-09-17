package Director;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class ElementDrive implements ElementEntry{

	private List<ElementEntry> list = null;
	
	ElementDrive(){
		list = new ArrayList<ElementEntry>();
	}
	
	public void add(ElementEntry elementEntry){
		list.add(elementEntry);
	}
	
	@Override
	public void Remove() {
		// TODO Auto-generated method stub
		Iterator<ElementEntry> itr = list.iterator();
		
		while(itr.hasNext()){
			ElementEntry entry = itr.next();
			entry.Remove();
		}
		
		System.out.println("element ‚·‚×‚Ä‚ğíœ‚µ‚Ü‚µ‚½B");
	}

	
	
	
}
