package constructors;

public class constructor_overloadingArgumettype {
	
	public constructor_overloadingArgumettype(int a,int b) {
		int c=a+b;
		System.out.println("Summation is: " +c);
	}
	
	public constructor_overloadingArgumettype(double a, double b) {
		double c=a+b;
		System.out.println("Summation is:" +c);
	}
	public void display() {
		System.out.println("constructor overloading is working succcessfully");
	}

	public static void main(String[] args) {
		constructor_overloadingArgumettype obj1 = new constructor_overloadingArgumettype(10,20);
		obj1.display();
		constructor_overloadingArgumettype obj2 = new constructor_overloadingArgumettype(20.55, 20.86);
		obj2.display();
		// TODO Auto-generated method stub

	}

}
