package hw11Q2Polymorphism;

public class Sister {
	/*
	 * YES we can create several methods with the same name (sister).
	 * When different methods exist with the same method name but with different parameters or signature, it is called method overloading.
	 */
	
	// void type method is implemented
	public void sister() {
		System.out.println("This is void type method From Sister class");
	}

	// void type parameterized method is implemented -01
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println(total1);
	}

	// void type parameterized method is implemented -02
	public void sister(String age4, int age1, int age2, int age3, int age5, int age6) {
		int total2 = Integer.parseInt(age4) + age1 + age2 + age3 + age5 + age6;
		System.out.println(total2);
	}

	// Return type parameterized method implemented -03
	public int sister(int age1, int age2, int age3, String age4) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println(total3);
		return total3;
	}

	// Return type parameterized method implemented -04
	public int sister(int age1, String age4, int age2, int age3) {
		int total4 = age1 + Integer.parseInt(age4) + age2 + age3;
		System.out.println(total4);
		return total4;
	}

	// Static type Method implemented -05
	public static int sister(int age1, int age2, int age3, String age4, int age5) {
		int total5 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println(total5);
		return total5;
	}

	// Static type Method implemented -06
	public static int sister(int age1, String age4, int age2, int age3, int age5) {
		int total6 = age1 + Integer.parseInt(age4) + age2 + age3 + age5;
		System.out.println(total6);
		return total6;
	}

	// Return type parameterized method which is final implemented -07
	public final int sister(int age2, int age3, String age4, int age5) {
		int total7 = age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println(total7);
		return total7;
	}

}
