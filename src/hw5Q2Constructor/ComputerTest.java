package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		// default Constructor is initialized
		Computer computer = new Computer();
		System.out.println("\n************************************\n");
		// Parameterized Constructor initialized
		Computer computer2 = new Computer(" Apple", "MacBook Air", "MacOS Mojave", 800, false, 'A');
		System.out.println("\n************************************\n");
		// Parameterized Constructor initialized
		Computer computer3 = new Computer("Dell", "Inspiron 5406 2n1", "Microsoft Windows 10 Home", 900, true, 'A');
	}
}
