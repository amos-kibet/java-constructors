### Constructors in Java
### Adapted from [JavaTpoint](https://www.javatpoint.com/java-constructor)
* In Java, a constructor is a block of codes similar to the method. 
* It is called when an instance of the class is created.
* It is a special type of method which is used to initialize the object.
* Every time an object is created using the new() keyword, at least one constructor is called.
* It is called constructor because it constructs the values at the time of object creation.
### Rules for creating Java constructor
#### There are two rules defined for the constructor.
#### Constructor name must be the same as its class name
* A Constructor must have no explicit return type
* A Java constructor cannot be abstract, static, final, and synchronized
### Types of Java constructors
#### There are two types of constructors in Java:
* Default constructor (no-arg constructor)
* Parameterized constructor
 
![sceenshot](https://static.javatpoint.com/images/core/java-constructor.png)

### Rule: 
#### If there is no constructor in a class, compiler automatically creates a default constructor.
### Q) What is the purpose of a default constructor?
#### The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type
### Why use the parameterized constructor?
#### The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.
![sceenshot](https://static.javatpoint.com/images/constructor-vs-method-in-java.jpg)
