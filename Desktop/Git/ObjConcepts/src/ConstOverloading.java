	public class ConstOverloading {
		 
	static int ConstOverloading(int x) {
				return x;
	}
	
	static double ConstOverloading(double y) {
		return y;
}
	static float ConstOverloading(float z) {
		return z;
}
	
	public static void main(String[] args) {
		int num1 =  ConstOverloading(5);
		double num2 =  ConstOverloading(5.1);
		float num3 =  ConstOverloading(1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}
