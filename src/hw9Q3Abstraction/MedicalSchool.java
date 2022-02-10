package hw9Q3Abstraction;

/* --one keywords are used for the inheritance in Java for Abstract Class.
 * --Abstract Class can inherit other Abstract Class or regular class, but not more than one
 * --Abstract class can not inherit Interfaces.
 */
public abstract class MedicalSchool extends NursingSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("Hello");
	}

	public MedicalSchool() {
	}
}
