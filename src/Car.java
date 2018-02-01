
public class Car {
	
	// Instance Variables
	String make;
	String model;
	int year;
	double price;
	
	// Constructor Methods (overloaded)
	public void Car() {
		
	}
	
	public void Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public static String toString(String make, String model, int year, double price) {
		String printString = String.format("%s \t %s \t %d \t $%,7.2f", make, model, year, price);
		return printString;
	}

}
