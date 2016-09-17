package Director;

public class Directory{

	public static void main(String[] args) {


		FireElement fire1 = new FireElement();
		FireElement fire2 = new FireElement();
		FireElement fire3 = new FireElement();
		
		WaterElement water1 = new WaterElement();
		WaterElement water2 = new WaterElement();
		
		ElementDrive drive = new ElementDrive();
		
		drive.add(fire1);
		drive.add(fire2);
		drive.add(fire3);
		drive.add(water1);
		drive.add(water2);
		
		drive.Remove();
		
	}
	
}
