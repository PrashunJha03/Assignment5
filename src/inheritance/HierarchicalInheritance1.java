package inheritance;



class Vehicle
{
	int vehicleNo;
	String brand;
	double price;
	
	static String dealerName = "Bajaj Automobiles";
	
	public Vehicle(int vehicleNo, String brand, double price) {
		
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.price = price;
	}
}


class Car extends Vehicle
{
	
	int numberOfDoors;
	String fuelType;
	public Car(int vehicleNo, String brand, double price, int numberOfDoors, String fuelType) {
		super(vehicleNo, brand, price);
		this.numberOfDoors = numberOfDoors;
		this.fuelType = fuelType;
	}
	
	void displayCar()
	{
		System.out.println(vehicleNo+" "+brand+" "+price+" "+numberOfDoors+" "+fuelType);
	}
	
}

class Bike extends Vehicle
{
	int engineCC;
	String helmetIncluded;
	public Bike(int vehicleNo, String brand, double price, int engineCC, String helmetIncluded) {
		super(vehicleNo, brand, price);
		this.engineCC = engineCC;
		this.helmetIncluded = helmetIncluded;
	}
	
	void displayBike()
	{
		System.out.println(vehicleNo+" "+brand+" "+price+" "+engineCC+" "+helmetIncluded);
	}
}

public class HierarchicalInheritance1 {

	public static void main(String[] args) {
		Car c1 = new Car(1001, "Kia", 700000, 6, "Diesel");
		Car c2 = new Car(1002, "Tata", 5000000, 6, "Diesel + Petrol");
		c1.displayCar();
		c2.displayCar();
		Bike b1 = new Bike(1001, "Kawasaki", 2500000, 1000, "Helmet Included");
		Bike b2 = new Bike(1002, "Ducati", 1500000, 800, "Helmet Not Included");
		b1.displayBike();
		b2.displayBike();
	}
	
}
