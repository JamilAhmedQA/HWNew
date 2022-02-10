package hw10Q2UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("---------- default constructor initialized for Daughter Class ----------");
		Daughter daughter1 = new Daughter();

		System.out.println("\n---------- parameterized constructor initialized for Daughter Class ----------");
		Daughter daughter2 = new Daughter("January", 18);

		System.out.println("\n---------- void type method initialized for Daughter Class ----------");
		daughter2.daughter();

		System.out.println("\n---------- parameterized method initialized for Daughter Class ----------");
		daughter2.daughterInfo("December", 16);

		System.out.println("\n---------- default constructor initialized for Father Class ----------");
		Father father1 = new Father();

		System.out.println("\n---------- parameterized constructor initialized for Father Class ----------");
		Father father2 = new Father("Jamil", 35, 'M', true);

		System.out.println("\n---------- void type method initialized for Father Class ----------");
		father2.father();

		System.out.println("\n---------- parameterized method initialized for Father Class ----------");
		father2.fatherInfo("Habib", 40, 'M', false);

	}

}
