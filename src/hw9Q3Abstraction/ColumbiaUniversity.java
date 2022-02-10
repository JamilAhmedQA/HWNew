package hw9Q3Abstraction;
/* --regular Class can inherit other regular Class or Abstract Class,But not more than one
 * --regular Class can not inherit interface
 * --regular Class can inherit only one regular Class or one Abstract Class.
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
