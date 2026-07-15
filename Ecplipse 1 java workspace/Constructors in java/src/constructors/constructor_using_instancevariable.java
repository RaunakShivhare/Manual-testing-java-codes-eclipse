package constructors;

public class constructor_using_instancevariable {
	String webName;
	int webAge;
	
	constructor_using_instancevariable(String name, int age){
		this.webName=name;
		this.webAge=age;
	}
    public static void main(String args[]) {
    	constructor_using_instancevariable obj1= new constructor_using_instancevariable("raunak",22); 
    	constructor_using_instancevariable obj2= new constructor_using_instancevariable("https:/google.com/:",18);
    	System.out.println(obj1.webName + " " + obj1.webAge);
    	System.out.println(obj2.webName + " " + obj1.webAge);
    }
}
