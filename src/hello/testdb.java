package hello;

public abstract class testdb{
	
	//
	public base create_type_datas(){
		// creat object csv or text or json etc
		return new base_db();
	}
	
	//
	public void printdata(){
		base datas = create_type_datas();
		String st = datas.getname();
		System.out.println(st);
	}
	
}
