package hw10Q3Abstraction;

/* --Abstract class can inherit only one abstract class or one regular class by extends keyword.
 * --Abstract class can not inherit Interfaces by extends keyword.
 * --Abstract class can inherit more than one Interface by implements keyword.
 */
public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("Hello");
	}

	public MedicalSchool() {
	}
}
