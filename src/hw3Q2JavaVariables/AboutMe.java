package hw3Q2JavaVariables;

public class AboutMe {
	// Variable declared here
	public String name;
	// Variables initialized here
	public String fullName = "Mohammad Jamil Ahmed";
	public byte age = 26;
	public short monthlyRent = 1200;
	public int yearlyIncome = 71564857;
	public long myBankAccount = 786545778463l;
	public float myHeight = 3.012f;
	public double myGrade = 3.14235768;
	public char sex = 'M';
	public boolean usCitizen = true;

	public static void main(String[] args) {
		// class (AboutMe) is instantiated
		AboutMe aboutMe = new AboutMe();
		System.out.println("My Full Name: " + aboutMe.fullName + "\nMy Age: " + aboutMe.age + "\nSex: " + aboutMe.sex);

	}

}