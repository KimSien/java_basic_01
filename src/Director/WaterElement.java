package Director;

public class WaterElement implements ElementEntry{
	public String datas;

	WaterElement(){
		this.datas = "water elements";
	}
	
	@Override
	public void Remove() {
		// TODO Auto-generated method stub
		System.out.println("delete water elements");
	}
	

}
