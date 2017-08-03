package Person;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Student("둘리");
		
		p.setName("둘리2");
		
		//Down Casting
		//Explicity Casting 명시적
		Student s1 = (Student)p;
		s1.set();
		
		( (Student)p ).set();
		
		//Up Casting
		//Implicity Casting 암시적
		Person p2 = s1;
		p2.setName("둘리3");
	}

}
