package hw9Q3Abstraction;
/* --regular Class can inherit regular Class.
 * --regular Class can not inherit an abstract class or interface
 * --regular Class can inherit only one regular Class.
 */
public class ColumbiaUniversity extends RockefellerUniversity {
    //--Regular class does not contain abstract method
    // public abstract void chemistry();
	public void biology() {
		System.out.println("Regular class does not contain abstract method");
	}

	public ColumbiaUniversity() {
	}
}
