
public class CreateFinal {
	
	public static void main(String[] args) {
		final double num = 25; 
		void message() {
			num = 29; 
			
		}
		
		CreateFinal num1 = new CreateFinal(); 
		System.out.println(num1.message);// it is an error 
		

	}

}
