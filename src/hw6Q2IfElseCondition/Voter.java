package hw6Q2IfElseCondition;

public class Voter {
	public static void main(String[] args) {
		// variables initialized here
		int age = 26;

		if (age == 18) {
			System.out.println("I am a Voter");
		} else if (age < 18) {
			System.out.println("I am not a Voter");
		} else if (age > 18) {
			System.out.println("I am a Voter");
		} else {
			System.out.println("Please add a valid age");
		}
	}

}
