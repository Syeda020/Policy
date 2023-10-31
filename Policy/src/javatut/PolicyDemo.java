package javatut;

import java.util.Scanner;
public class PolicyDemo {
	
	// salary  variable is a private static variable
	private static double policy ;

	public static void main(String[] args) {
		 // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for policy details
        System.out.print("Enter Policy Number: ");
        String policyNumber = scanner.nextLine();
        System.out.print("Enter Provider Name: ");
        String providerName = scanner.nextLine();
        System.out.print("Enter Policyholder's First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Policyholder's Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Policyholder's Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();
        System.out.print("Enter Policyholder's Height (in inches): ");
        double heightInInches = scanner.nextDouble();
        System.out.print("Enter Policyholder's Weight (in pounds): ");
        double weightInPounds = scanner.nextDouble();
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, heightInInches, weightInPounds);
       
        double bmi = policy.calculateBMI();
        double price = policy.calculatePolicyPrice();
        
        System.out.println(policy.getPolicyNumber());
        System.out.println(policy.getProviderName());
        System.out.println(policy.getFirstName());
        System.out.println(policy.getLastName());
        System.out.println(policy.getAge());
        System.out.println(policy.getSmokingStatus());
        System.out.println(policy.getHeightInInches());
        System.out.println(policy.getWeightInPounds());
        System.out.println("BMI: " + bmi);
        System.out.println("Policy Price: $" + price);
    }

}
