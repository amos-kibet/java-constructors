package constructors;
// A constructor which displays default values
public class NoArgConstructor2 {
	int id;  
	String name;
	
	// Method to display the value of id and name
	void display() {
		System.out.println(id +" "+ name);
	}
	
	public static void main(String[] args) {
		
		// Creating objects
		NoArgConstructor2 Student1 = new NoArgConstructor2();
		NoArgConstructor2 Student2 = new NoArgConstructor2();
		
		// Displaying values of the object
		Student1.display();
		Student2.display();
	}
}