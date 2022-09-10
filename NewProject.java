package poisedPackage;

// This class forms part of the bigger Capstone project I for Object-oriented programming, task 7.
// The overall project is to design a project management system for an engineering firm called 'Poised'.
// The program is meant to keep track of the projects that are dealt with in the company.
// The current class is used to define methods needed to add new project info.

// Main class declaration.
public class NewProject {

		// Listing variable attributes for the 'NewProject' class.
		int projectNumber;
		String projectName;
		String buildingType;
		String address;
		String erfNumber;
		double totalFee;
		double amountPaid;
		String deadline;
		
		// Writing a constructor method to create a new project object.
		// This takes in all the attributes of the project above.
		public NewProject(int projectNumber, String projectName, String buildingType, 
				String address, String erfNumber, double totalFee, double amountPaid, String deadline) {
		
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.address = address;
		this.erfNumber = erfNumber;
		this.totalFee = totalFee;
		this.amountPaid = amountPaid;
		this.deadline = deadline;
		
	}
		
		// Writing a method to display the project in an easy-to-read format.
		// This method returns a string 'output' with all the project details.
		public String DisplayProject() {
			
			System.out.println("The details for project " + projectName + " are as follows: \n");
			String output = "Project Number: " + projectNumber;
			output += "\nProject Name: " + projectName;
			output += "\nBuilding Type: " + buildingType;
			output += "\nPhysical Address: " + address;
			output += "\nERF Number: " + erfNumber;
			output += "\nProject Fee Total: R" + totalFee;
			output += "\nAmount Paid to Date: R" + amountPaid;
			output += "\nProject Deadline: " + deadline;
			
			return output;  // Output string returned.
			
		}

}
