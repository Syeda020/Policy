package javatut;

public class Policy {
	    // Attributes
	    private String policyNumber;
	    private String providerName;
	    private String firstName;
	    private String lastName;
	    private int age;
	    private String smokingStatus;
	    private double heightInInches;
	    private double weightInPounds;

	    // Default constructor with default values
	    public Policy() {
	        this.policyNumber = "";
	        this.providerName = "";
	        this.firstName = "";
	        this.lastName = "";
	        this.age = 0;
	        this.smokingStatus = "";
	        this.heightInInches = 0.0;
	        this.weightInPounds = 0.0;
	    }

	    // Constructor with arguments to initialize all fields
	    public Policy(String policyNumber, String providerName, String firstName, String lastName, int age,
	                  String smokingStatus, double heightInInches, double weightInPounds) {
	        this.policyNumber = policyNumber;
	        this.providerName = providerName;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	        this.smokingStatus = smokingStatus;
	        this.heightInInches = heightInInches;
	        this.weightInPounds = weightInPounds;
	    }

	    // Getter and setter methods for all fields
	    public String getPolicyNumber() {
	        return policyNumber;
	    }

	    public void setPolicyNumber(String policyNumber) {
	        this.policyNumber = policyNumber;
	    }

	    public String getProviderName() {
	        return providerName;
	    }

	    public void setProviderName(String providerName) {
	        this.providerName = providerName;
	    }

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

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getSmokingStatus() {
	        return smokingStatus;
	    }

	    public void setSmokingStatus(String smokingStatus) {
	        this.smokingStatus = smokingStatus;
	    }

	    public double getHeightInInches() {
	        return heightInInches;
	    }

	    public void setHeightInInches(double heightInInches) {
	        this.heightInInches = heightInInches;
	    }

	    public double getWeightInPounds() {
	        return weightInPounds;
	    }

	    public void setWeightInPounds(double weightInPounds) {
	        this.weightInPounds = weightInPounds;
	    }

	    // Method to calculate and return the BMI
	    public double calculateBMI() {
	        return (weightInPounds * 703) / (heightInInches * heightInInches);
	    }

	    // Method to calculate and return the price of the insurance policy
	    public double calculatePolicyPrice() {
	        double baseFee = 600.0;
	        double additionalFee = 0.0;

	        if (age > 50) {
	            additionalFee += 75.0;
	        }

	        if ("smoker".equalsIgnoreCase(smokingStatus)) {
	            additionalFee += 100.0;
	        }

	        double bmi = calculateBMI();
	        if (bmi > 35) {
	            additionalFee += (bmi - 35) * 20.0;
	        }

	        return baseFee + additionalFee;
	    }
	}

