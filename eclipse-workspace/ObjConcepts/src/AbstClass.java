
public class AbstClass {

	
	public static void main(String[] args) {
		// Abstract class 
		abstract class Sports{
			public abstract void exercise();
			
			public void play() {
				System.out.println("I like to play sports");
			}
		}
			//Subclass 
		class Volleyball extends Sports{
			public void exercise() {
				System.out.println("I play volleyball");
			}
		}
		Volleyball vball = new Volleyball(); 
		vball.play();
		vball.exercise();
		
	}

}
