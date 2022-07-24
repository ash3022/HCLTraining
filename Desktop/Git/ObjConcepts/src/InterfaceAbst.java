
public class InterfaceAbst {

	public static void main(String[] args) {
		
		interface Sports{
			public void exercise();
			public void play();
		}
		
		
		class Volleyball implements Sports {
			public void exercise() {
				System.out.println("I like to exercise.");
			}
			public void play(){
				System.out.println("I play volleyball.");
			}
		}
		Volleyball vball = new Volleyball(); 
		vball.exercise();
		vball.play();
		
		

		
	}

}
