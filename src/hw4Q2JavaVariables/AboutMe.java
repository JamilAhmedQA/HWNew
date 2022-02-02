package hw4Q2JavaVariables;

public class AboutMe {
	// variables declared here
	public String name;
	public byte age;
	public short myMonthlyHouseRent;
	public int myYearlyIncome;
	public float height;
	public double myGrade;
	public char sex;
	public long phoneNumber;
	public boolean usCitizen;

	// Default Constructor declared here
	public AboutMe() {
		System.out.println("This  all is about me");

	}

	// method implemented
	public void aboutMe() {

		System.out.println("\nMy Name is: " + name + "\nAge: " + age + "\nMonthly HouseRent: " + myMonthlyHouseRent
				+ "\nYearly Income: " + myYearlyIncome + "\nHeight: " + height + "\nGrade: " + myGrade + "\nSex: " + sex
				+ "\nPhone Number: " + phoneNumber + "\nUs Citizen: " + usCitizen);

	}

}
