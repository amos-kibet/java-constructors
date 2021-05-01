/**
 * 
 */
package constructors;

/**
 * @author Amos
 * Java Program to demonstrate the use of the parameterized constructor.
 */
public class ArgConstructor1 {
	int id;  
	String name;

	// Creating a parameterized constructor  
	ArgConstructor1(int i, String n) {  
		id = i;  
		name = n;  
	} 
	
	// Method to display the values  
	void display() {
		System.out.println(id+" "+name);
	}  
	
	public static void main(String args[]) {  
		// Creating objects and passing values  
		ArgConstructor1 obj1 = new ArgConstructor1(1,"Amos");  
		ArgConstructor1 obj2 = new ArgConstructor1(2,"Kibet");  
		// Calling method to display the values of object  
		obj1.display();  
		obj2.display();  
	}
}