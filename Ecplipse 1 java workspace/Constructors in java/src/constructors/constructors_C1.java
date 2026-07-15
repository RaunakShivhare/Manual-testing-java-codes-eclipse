package constructors;

public class constructors_C1 {
	
	public constructors_C1() {
		System.out.println("This is the constructor block");
	}
	
	public void method() {
		System.out.println("This is the method block");
	}

	public static void main(String[] args) {
		constructors_C1 obj = new constructors_C1();//deefault constructor
		// constructor block will automatically invoked
		//need to call explicitly for the method
		obj.method();
	}
}
