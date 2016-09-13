package hello;

public class hello {

	public static void main(String[] args) {
		int[] number = {10,20,30,40,50};
		for(int i = 0; i < number.length; i++){
		System.out.println(number[i]);	}
		
		addplus(2);
	}

	
	private static int addplus(int a){
		int b;
		b = a;
		System.out.println(a);
		return b;
	}
	
}
