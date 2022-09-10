package poisedPackage;

// This class was written to create a new person object and display the details.
// This class is called on in the main 'PoisedMenu' program.

// Main class declaration.
public class NewPerson {
	
	// Attribute variables declared for use in this class.
	String personType;
	String name;
	int number;
	String email;
	String address;
	
	// Writing a constructor method to create a new person object.
	// This takes in all the attributes of the person above.
	public NewPerson(String personType, String name, int number, String email, String address) {
		
		this.personType = personType;
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;
		
	}
	
	// This method displays the person object details in an easy-to-read format.
	// It returns the string 'output' with all of the person's details.
	public String DisplayPerson() {
		
		System.out.println(personType + " details are as follows: \n");
		String output = "Title: " + personType;
		output += "\nName: " + name;
		output += "\nNumber: " + number;
		output += "\nEmail Address: " + email;
		output += "\nPhysical Address: " + address;
		
		return output;  // String output returned.
	}
}
