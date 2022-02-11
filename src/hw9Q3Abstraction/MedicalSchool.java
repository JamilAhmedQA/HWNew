package hw9Q3Abstraction;

/* --Abstract class can inherit only one abstract class or one regular class by extends keyword.
 * --Abstract class can not inherit Interfaces by extends keyword.
 */
public abstract class MedicalSchool extends NursingSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("Hello");
	}

	public MedicalSchool() {
	}
}
