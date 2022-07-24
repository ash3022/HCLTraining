


class SuperOne {//SuperClass (parent) 
		public void subSuper() {
			System.out.println("this is a superclass");
		}
	}

	class SubSuperOne extends SuperOne{ // subclass child 
		public void subSuper() {
			super.subSuper();      // call the superclass 
		System.out.println("this is a subclass");
	}
	}
	public class UseOfSuper{
	public static void main(String[] args) {
		SuperOne mySuper = new SubSuperOne();
		mySuper.subSuper();

	}

}
