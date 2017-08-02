package Person;

public class Student extends Person {
	
	
	
	public Student () {
		System.out.println("Student Contructor Create");
	}
	
	public Student ( String name) {
		// super();
		super(name);
		System.out.println("Student - (String name) Contructor Create");
	}
	
	
	
	
	
	
	
	public void set() {
		//public
		name = "둘리";
		
		//protected
		height = 150;
		
		//default
		age = 35;
		
		//private
		//weight = 40;
	}
}
