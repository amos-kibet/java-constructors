/**
 * 
 */
package constructors;

/**
 * @author Amos
 * Java program to overload constructors 
 */
public class ArgConstructor2 {
	int id;  
	String name;  
	int age;
	  
	// Creating two arg constructor  
	ArgConstructor2(int i, String n) {  
		id = i;  
		name = n;  
	}
	// Creating three arg constructor  
	ArgConstructor2(int i, String n, int a) {  
		id = i;  
	    name = n;  
	    age=a;  
	 } 
	
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
	
	  public static void main(String args[]) {  
		  ArgConstructor2 obj1 = new ArgConstructor2(1,"Amos");  
		  ArgConstructor2 obj2 = new ArgConstructor2(2,"Kibet",23);  
		  obj1.display(); // Will display default value for field age  
		  obj2.display();  
	  }
}

 

   

 
