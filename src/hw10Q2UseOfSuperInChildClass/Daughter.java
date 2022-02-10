package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		super.father();
		super.fatherInfo("David", 40, 'M', false);
		super.familyName = "Ahmed";
		System.out.println("FamilyName: " + familyName);
		System.out.println("This is a default constructor from Daughter class");
	}

	public Daughter(String birthMonth, int age) {
		super("Ruhul", 35, 'M', true);
		super.father();
		super.fatherInfo("Shumon", 40, 'M', false);
		super.familyName = "Hussain";
		System.out.println("FamilyName: " + familyName);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("BirthMonth: " + birthMonth + ", Age: " + age);
	}

	public void daughter() {
		super.father();
		super.fatherInfo("Abul", 40, 'M', false);
		super.familyName = "Kalam";
		System.out.println("FamilyName: " + familyName);
		System.out.println("This is a void type method from Daughter class");
	}

	public void daughterInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo("Habib", 40, 'M', false);
		super.familyName = "Bhuiyan";
		System.out.println("FamilyName: " + familyName);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("BirthMonth: " + birthMonth + ", Age: " + age);
	}

}
