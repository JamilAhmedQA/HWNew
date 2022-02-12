package hw11Q3Abstraction;

/* --Interfaces can inherit other Interfaces by extends keyword.
 * -- Interfaces can not inherit regular class or abstract class by extends keyword.
 * --Interfaces can inherit more than one Interfaces by extends keyword.
 * --implements keyword can't be used for inheritance in Interface
 */
public interface University extends College, Hospital {

	public void classSize();

	public void playGround();

	public void teacher();

	// public University() {
	// } ---interfaces can not have constructors
	public default void gymnasium() {
	}

	public static void library() {
	}
}
