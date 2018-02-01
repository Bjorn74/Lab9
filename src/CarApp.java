import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
	// Initialize
		Scanner scan = new Scanner(System.in);
		
		banner();
	Car[] inventory = carEntry(Validator.getInt(scan, "How many cars are you entering?", 1, 1000), scan);
	printInventory(inventory);
	endSplash();

	}
	
	private static void banner() {
	System.out.println("Welcome the the Grand Circus Motors admin console!");
	}
	
	private static Car[] carEntry(int carsNum, Scanner scan) {
		
		// Build Array
		Car[] inventory = new Car[carsNum];
		
		// Begin Data Entry	
	for (int i=0; i<inventory.length;i++) {
		inventory[i] = new Car();
		System.out.println("Enter Car #" + (i+1) + " Make:");
		inventory[i].setMake(scan.next());
		
		System.out.println("Enter Car #" + (i+1) + " Model:");
		inventory[i].setModel(scan.next());
		
		System.out.println("Enter Car #" + (i+1) + " Year:");
		inventory[i].setYear(scan.nextInt());
		
		System.out.println("Enter Car #" + (i+1) + " Price:");
		inventory[i].setPrice(scan.nextDouble());
		
	}
		// Return the array
	return inventory;
	}
	
	private static void printInventory(Car[] list) {
		System.out.println("Current Inventory:");
		for (int i=0; i<list.length; i++) {
		String make = list[i].make;
		String model = list[i].model;
		int year = list[i].year;
		double price = list[i].price;
			System.out.println(Car.toString(make, model, year, price));
		}	
	}
		
		private static void endSplash() {
			System.out.println();
			System.out.println("Thanks for entering car inventory.");
		}
	
	
	
}
