package hw8Q2Inheritance;

public class AnimalTest {
	
	    /*
	     * Hierarchical Inheritance example.
	     * More than one class is derived from one single Parent/Base class.
	     * Mammal class extends Animal class, Reptile class extends Animal class, Birds class extends Animal class.
	     */
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		/*
		 * single inheritance example.
		 * Mammal class extends Animal class, is an example of single inheritance. 
		 */
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		/* Multi-Level Inheritance example.
		 * Cobra class extends Snake class, Snake class extends Reptile class, 
		 * Reptile class extends Animal class.
		 */
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		
		System.out.println("\n----------------------------------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
	}
}