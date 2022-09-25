package newHireCredentials;
/*
This is a class employee. Here we have to pass employee's firstName and 
lastName.
*/
//public class employee {

//}

import java.util.Scanner;

public class employee {
    private String firstName;
    private String lastName;
    private String fullEmail;
    
    public String getFirstName() {
		return firstName;
	}

    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullEmail() {
		return fullEmail;
	}

	public void setFullEmail(String fullEmail) {
		this.fullEmail = fullEmail;
	}

	final String emailSuffix = "abc.com"; // Assume company name is "abc"
    
    
	//parameterized constructor for firtsName and lastName
    
	public employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

 
    //Main method to get firstName and lastName from the hired employee

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First Name:-\n");
        String firstName = sc.next();

        System.out.print("Enter your Last Name:-\n");
        String lastName = sc.next();
        
       /* to have the firstName and lastName in the object, credential 
        * and then invoke showCredentials method in the credentialService class
        */
        credentialService credential = new credentialService(firstName, lastName);
        credential.showCredentials();
        
        sc.close();
        
    }

}
