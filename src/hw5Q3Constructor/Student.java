package hw5Q3Constructor;

public class Student {
	// variables declared here
	public String stName;
	public int stId;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	// Default Constructor declared here
	public Student() {
		System.out.println("This is from default Constructor of Student class");
	}

	// Parameterized Constructor declared here
	public Student(String stName, int stId, char sex, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stId = stId;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name: " + stName + ", ID: " + stId + ", Sex: " + sex
				+ ", and Java Programmer? Ans: " + isProgrammer + ", Grade: " + grade);
	}
}
