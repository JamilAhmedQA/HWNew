package hw10Q3Abstraction;
/* --A regular class can inherit only one regular class or one abstract class by extends keyword.
 * --regular Class can not inherit interface by extends keyword.
 * --A regular class can inherit more than one Interface by implements keyword.
 * --A regular class cannot inherit a regular class or abstract class by implements keyword.
 */
public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{
    //--Regular class does not contain abstract method.
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

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}
}
