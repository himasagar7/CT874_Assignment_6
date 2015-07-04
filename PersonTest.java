package assignment_6;
/*
 * This program is to test the Person class defined below
 */
public class PersonTest {

	public static void main(String[] args) {
		// Creating Object of type Person
		Person p1 = new Person();
		// Constructor invoked automatically
		Person p2 = new Person("Hima",25,'M');
		
		// Cannot access private variables directly
		//p2.age =  20;
		
		// Can be accessed by calling setter methods as below
		//p2.setAge(20);
		
		System.out.println("P1 details:");
		System.out.println("Name:"+p1.getName ()+" Age: "+p1.getAge()+" Gender: "+p1.getGender());

		System.out.println("P2 details:");
		System.out.println("Name:"+p2.getName ()+" Age: "+p2.getAge()+" Gender: "+p2.getGender());
	}

}
