package poisedPackage;

// Importing scanner module to get user input.
import java.util.Scanner;

public class Poised {  // Main class declaration.

	public static void main(String[] args) {  // Main method declaration.
		
		// Declaring variables to be used in this program.
		int projectNumber;
		String projectName;
		String buildingType;
		String address;
		String erfNumber;
		double totalFee;
		double amountPaid;
		String deadline;
		
		// Specifying the string 'personType' for use later on.
		String personType = "Contractor";
		
		// Introduction message to user.
		System.out.println("Welcome to the Poised. You will now be prompted to create a new project.");
		
		// The user is then prompted to fill in details about the project.
		// Their input is scanned in and stored in the appropriate variables.
		// Project number.
		System.out.println("\nPlease enter the project number: ");
		Scanner input1 = new Scanner(System.in);
		projectNumber = input1.nextInt();
		
		// Project name.
		System.out.println("Please enter the project name: ");
		Scanner input2 = new Scanner(System.in);
		projectName = input2.nextLine();
		
		// Building type.
		System.out.println("Please enter the building type: ");
		Scanner input3 = new Scanner(System.in);
		buildingType = input3.nextLine();
		
		// Physical address.
		System.out.println("Please enter the physical address for the project: ");
		Scanner input4 = new Scanner(System.in);
		address = input4.nextLine();
		
		// ERF number.
		System.out.println("Please enter the ERF number: ");
		Scanner input5 = new Scanner(System.in);
		erfNumber = input5.nextLine();
		
		// Total fee for the project.
		System.out.println("Please the total fee charged for the project: ");
		Scanner input6 = new Scanner(System.in);
		totalFee = input6.nextDouble();
		
		// Amount paid to date by the customer.
		System.out.println("Please the total amount paid to date: ");
		Scanner input7 = new Scanner(System.in);
		amountPaid = input7.nextDouble();
		
		// Project deadline.
		System.out.println("Please enter the project deadline: ");
		Scanner input8 = new Scanner(System.in);
		deadline = input8.nextLine();
		
		// A new project object is then created using the details entered above, 
		// as well as the NewProject() method defined in the NewProject class.
		NewProject createProject = new NewProject(projectNumber, projectName, buildingType, address, 
				erfNumber, totalFee, amountPaid, deadline); 
		System.out.println("Your project was successfully created.");
		
		// Calling the DisplayProject() method in the NewProject class to display the new project.
		System.out.println(createProject.DisplayProject());
		
		// The user is then shown a short menu with options to edit, update, finalise or exit.
		System.out.println("\nPlease choose a number option from the menu below: \n"
					+ "\n1. Edit existing projects" + "\n2. Update contractor details"
					+ "\n3. Finalise the project" + "\n4. Exit program");
			
		// Getting their input choice.
		// Storing their choice in 'userChoice' variable.
		Scanner input = new Scanner(System.in);
		int userChoice = input.nextInt();
		
			// Setting if condition to run if the user chooses option 1, to edit existing projects.
			if (userChoice  == 1)
			{	
				// They are then given a choice of either editing the due date or the amount paid to date.
				System.out.println("Would you like to:" + 
						"\n1. Edit the project due date or" +
						"\n2. Edit the total amount paid of the fee to date?" +
						"\nChoose either 1 or 2");
				
				// Their choice is stored in the 'editChoice' variable.
				Scanner choice = new Scanner(System.in);
				int editChoice = choice.nextInt();
				
				if (editChoice == 1)  // If they choose 1. 
				{	
					// They are prompted to enter a new due date.
					System.out.println("\nPlease enter a new due date for the project: ");
					Scanner date = new Scanner(System.in);
					
					// deadline variable then updated to store the new due date.
					deadline = date.nextLine();  
					
					// New project object created to include the new due date value.
					NewProject projectEdit = new NewProject(projectNumber, projectName, buildingType, address,
							erfNumber, totalFee, amountPaid, deadline);
					System.out.println(projectEdit.DisplayProject());  // Edited project object displayed.
					
				}
				else if (editChoice == 2)  // If they choose 2.
					
					// The user is prompted to enter a new amount paid to date.
					System.out.println("\nPlease enter a new total amount of the fee paid to date: ");
					Scanner amount = new Scanner(System.in);
					
					// amountPaid variable is updated to store the new value.
					amountPaid = amount.nextDouble();
					
					// New project object created to include the updated amount paid value.
					NewProject projectEdit2 = new NewProject(projectNumber, projectName, buildingType, address,
							erfNumber, totalFee, amountPaid, deadline);
					System.out.println(projectEdit2.DisplayProject());  // Edited project object displayed. 
			}
			
			else if (userChoice == 2)  // If they choose 2 from the menu.
			{	
				// The user is then prompted to enter the contractor's details to update the information.
				// Their input is scanned inn and stored in appropriate variables.
				System.out.println("\nPlease enter the contractor's name to confirm their details: ");  // name.
				Scanner nameEdit = new Scanner(System.in);
				String name = nameEdit.nextLine();
				
				System.out.println("\nPlease enter the contractor's new contact number: ");  // Contact number.
				Scanner newNumber = new Scanner(System.in);
				int number = newNumber.nextInt();
				
				System.out.println("\nPlease enter the contractor's new email address: ");  // Email address.
				Scanner newEmail = new Scanner(System.in);
				String email = newEmail.nextLine();
				
				System.out.println("\nPlease enter the contractor's new physical address: ");  // Physical address.
				Scanner newAddress = new Scanner(System.in);
				address = newAddress.nextLine();
				
				// New person object created with the updated details for the contractor.
				NewPerson contractorEdit = new NewPerson(personType, name, number, email, address);
				
				// Successful message printed out, as well as the details for the updated contractor.
				System.out.println("Your contractor details have been update successfully. \n");
				System.out.println(contractorEdit.DisplayPerson());	
				
			}
			
		else if (userChoice == 3)  // If they choose option 3 from the menu.
			{
				if (totalFee == amountPaid)  // If they have already paid the project fee in full.
				{	
					// No invoice is generated but they are prompted to enter a completion date.
					System.out.println("The project has been paid in full. No invoice generated.");
					System.out.println("Please add a completion date for this project: ");
					
					Scanner newDate = new Scanner(System.in);
					String completion = newDate.nextLine();  // Completion date stored in string variable.
					String finalise = "Finalised";
					
					// The project object is then displayed with all details including the completion date,
					// as well as the 'finalised' state of the project.
					System.out.println(createProject.DisplayProject() + "\nCompletion Date: " + completion);
					System.out.println("\nProject status: " + finalise);
					
					
				}
				
				else if (totalFee != amountPaid)  // If the customer has not yet paid in full.
				{	
					// The user is prompted to add customer details to generate an invoice.
					System.out.println("Your invoice will be generated with the following details: ");
					System.out.println("\nPlease enter the customer's full name: ");
					Scanner customer = new Scanner(System.in);
					String name2 = customer.nextLine();
					
					personType = "Customer";  // Updating personType to 'customer'.
					
					System.out.println("\nPlease enter the customer's contact number: ");
					Scanner contact = new Scanner(System.in);
					int number2 = contact.nextInt();
					
					System.out.println("\nPlease enter the customer's email address: ");
					Scanner contact2 = new Scanner(System.in);
					String email2 = contact2.nextLine();
					
					System.out.println("\nPlease enter the customer's physical address: ");
					Scanner physAddress = new Scanner(System.in);
					String address2 = physAddress.nextLine();
					
					// The user is also prompted to add a completion date for the project.
					System.out.println("Please add a completion date for this project: ");
					
					Scanner newDate2 = new Scanner(System.in);
					String completion2 = newDate2.nextLine();  // Completion date stored in string variable.
					String finalise2 = "finalised";
					
					// New person object created to display the customer's details.
					NewPerson customer1 = new NewPerson(personType, name2, number2, email2, address2);
					System.out.println("\nPlease view your invoice details below: ");
					
					// Invoice details displayed with customer details and amount still owed.
					System.out.println(customer1.DisplayPerson());
					System.out.println("\nAmount still owed: R" + (totalFee - amountPaid) + "\n");
					
					// The project object is then displayed with all details including the completion date,
					// as well as the finalised status of the project.
					System.out.println(createProject.DisplayProject() + "\nCompletion Date: " + completion2);
					System.out.println("Project status: " + finalise2);
					
				}
			}
		
		if (userChoice == 4)  // If the user chooses 4 from the menu.
		{	
			// Successful logout message.
			System.out.println("You are successfully logged out.");
		}	
		
	}

}
