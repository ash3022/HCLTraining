
public class MethodOverride {

	
	public static void main(String[] args) {
		class Dept {
			void deptName() {
			System.out.println("This is a parent class");
			}
		}
		class Employee extends Dept {
			void deptName() {
				System.out.println("This is a child class");
			}
			
		}
			Dept dept = new Dept(); 
			dept.deptName();
			Employee emp = new Employee();
			emp.deptName();
	}

}
