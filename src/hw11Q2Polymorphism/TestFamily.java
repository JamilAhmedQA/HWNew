package hw11Q2Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		
		System.out.println("\n-------- Sister --------");
		Sister sister = new Sister();
		sister.sister();
		sister.sister(25, 35, 45, "23", 28, 30);
		sister.sister("20", 14, 25, 36, 46, 24);
		sister.sister(15, 25, 46, "15");
		sister.sister(15, "45", 18, 25);
		Sister.sister(21, 26, 42, "35", 30);
		Sister.sister(32, "25", 21, 23, 45);
		sister.sister(21, 23, "31", 25);
		
		System.out.println("\n-------- Niece --------");
		Niece niece = new Niece();
		niece.sister();
		niece.sister(25, 35, 45, "23", 28, 30);
		niece.sister("20", 14, 25, 36, 46, 24);
		niece.sister(15, 25, 46, "15");
		niece.sister(15, "45", 18, 25);
		Niece.sister(21, 26, 42, "35", 30);
		Niece.sister(32, "25", 21, 23, 45);
	}

}
