package newHireCredentials;

/* This class has generatePassword, generateEmailAddress and showCredentials
 * methods for a new hire.
 */
import java.util.Scanner;

public class credentialService extends employee {

    private String lastName;
	private String firstName;

	public credentialService(String firstName, String lastName) {
        super(firstName, lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // To have the department (Technical, Administration, Human Resource, Legal)
    public static String department(){
        System.out.println(
                "Please select your department from the following:-\n1. Technical\n2. Administration\n3. Human Resource\n4. Legal");
        System.out.print(
                "(Example: Press 1 for Technical, 2 for Administration, 3 for Human Resource, 4 for Legal):\n");
        Scanner sc = new Scanner(System.in);
        int dept = sc.nextInt();
        sc.close();

        switch(dept) {
        case 1:
        	dept = 1;
        	return "tech";
        case 2:
        	dept = 2;
        	return "admin";
        case 3:
        	dept = 3;
        	return "hr";
        case 4: 
        	dept = 4;
        	return "legal";
        default:
        	System.out.println("Wrong number selection for department. Logged out.");
			return null; // If the user selects other than 1,2,3,4 then error in code execution.
        }
        	
    }
           
    /* 
     * Code to generate any random password using capital letters, small letters,
     * numbers and special characters.
     */
    
    public String generatePassword(int length){
    	
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialChars = "~!@#$%^&*)_(";
				
		String passwordParameter = capitalLetters+smallLetters+numbers+specialChars;
		
	    char[] password = new char[length];
	        for (int i = 0; i < length; i++) {
	            int randomPass = (int) (Math.random() * passwordParameter.length());
	            password[i] = passwordParameter.charAt(randomPass);
	        }
	        return new String(password);
		
	}
    
   
    // method to generateEmailAddress and show it

    public void generateEmailAddress() {
        String fullEmail = firstName.toLowerCase() + lastName.toLowerCase() +"@"+ department().toLowerCase()+ "." + emailSuffix;
        System.out.printf("Dear %s, your generated credentials are as follows:-\nEmail: %s\n",firstName,fullEmail);
    }

    /* 
     * showCredentials method used to invoke and show email address generated and to 
     * generate and show password of length 10 characters.
     */
    public void showCredentials() {
        generateEmailAddress();
        System.out.println("Password: "+generatePassword(10));
        System.out.println("Thank you!");
    }
}


