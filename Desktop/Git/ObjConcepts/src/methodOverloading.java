
public class methodOverloading {
	
	
	static int number (int myNumber) {
		return myNumber; 
		
		
	}
	static double number (double herNumber) {
		return herNumber; 
		
	}
	 static double number (int myNumber, double herNumber) {
		return myNumber + herNumber; 
		
	}
	
	public static void main(String[] args) {
		methodOverloading myNumber = new methodOverloading( ); 
		System.out.println(methodOverloading.number(2));
		System.out.println(methodOverloading.number(6.7));
		System.out.println(methodOverloading.number(2,6.7));
		
		
		

	}
}

