package hw11Q2Polymorphism;

public class Niece extends Sister {

	@Override
	public void sister() {
		System.out.println("This is void type method From Niece class");
	}

	@Override
	public void sister(int age1, int age3, int age2, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6 - 5;
		System.out.println(total1);
	}

	@Override
	public void sister(String age4, int age1, int age2, int age5, int age3, int age6) {
		int total2 = Integer.parseInt(age4) + age1 + age2 + age3 + age5 + age6 * 2;
		System.out.println(total2);
	}

	@Override
	public int sister(int age2, int age1, int age3, String age4) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4) + 10;
		System.out.println(total3);
		return total3;
	}

	@Override
	public int sister(int age1, String age4, int age2, int age3) {
		int total4 = age1 + Integer.parseInt(age4) + age2 + age3 / 2;
		System.out.println(total4);
		return total4;
	}

	/*
	 * static method can't be override, if we remove @override it will work as static method of this child (Niece) class.
	 * Here i used static method without @override as an example.
	 */
	public static int sister(int age1, int age2, int age3, String age4, int age5) {
		int total5 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + 4;
		System.out.println(total5);
		return total5;
	}

	/*
	 * static method can't be override, if we remove @override it will work as static method of this child (Niece) class.
	 * Here i used static method without @override as an example.
	 */
	public static int sister(int age1, String age4, int age2, int age3, int age5) {
		int total6 = age1 + Integer.parseInt(age4) + age2 + age3 + age5 * 2;
		System.out.println(total6);
		return total6;
	}

	/*
	 * Final type method cannot be Overriden.
	 * @Override 
	 * public final int sister(int age2, int age3, String age4, int age5) {
	 *  int total7 = age2 + age3 + Integer.parseInt(age4) + age5;
	 * System.out.println(total7); 
	 * return total7; 
	 * }
	 */

}
