package javatut;

public class PolicyHolder {
	
    private Policy policyholder;
    private static int holderCount;

    public PolicyHolder() {
        policyholder = new Policy();
        getPolicyDetails();
        holderCount++;
    }

    public PolicyHolder(String policyNumber, String providerName, String firstName, String lastName, int age,
            String smokingStatus, double heightInInches, double weightInPounds) {
        policyholder = new Policy(policyNumber, providerName, firstName, lastName, age,
        		smokingStatus, heightInInches, weightInPounds);
        getPolicyDetails();
        holderCount++;

    }
    
    private void getPolicyDetails() {
    	System.out.println(policyholder.getPolicyNumber());
    	System.out.println(policyholder.getProviderName());
    	System.out.println(policyholder.getFirstName());
    	System.out.println(policyholder.getLastName());
    	System.out.println(policyholder.getAge());
    	System.out.println(policyholder.getSmokingStatus());
    	System.out.println(policyholder.getHeightInInches());
    	System.out.println(policyholder.getWeightInPounds());
    	System.out.println("BMI: " + policyholder.calculatePolicyPrice());
        System.out.println("Policy Price: $" + policyholder.calculatePolicyPrice());
    }
    
    public int getHolderCount() {
    	return holderCount;
    }
}
