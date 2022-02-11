package hw9Q3Abstraction;
/* --A regular class can inherit only one regular class or one abstract class by extends keyword.
 * --regular Class can not inherit interface by extends keyword.
 */
public class ColumbiaUniversity extends MedicalSchool {
    //--Regular class does not contain abstract method
    // public abstract void chemistry();
	public void biology() {
		System.out.println("Regular class does not contain abstract method");
	}

	public ColumbiaUniversity() {
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
}
