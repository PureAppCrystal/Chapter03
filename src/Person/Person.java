package Person;

public class Person {
	
    public String name;
    protected int height;
    int age;
    private int weight;
    
    
    
    //contructor
    public Person () {
    	System.out.println("Person Contructor Create");
    }
    
    public Person (String name) {
    	System.out.println("Person - (String name) Contructor Create");
    }

    
    //sgetter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
    
    

}
