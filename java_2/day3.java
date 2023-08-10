import java.util.*;

public class Vehicle {
	String brand;
	String model;
	Integer year;
	Integer rentalPrice;

	public Vehicle(brand, model, year, rentalPrice) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.rentalPrice = rentalPrice;
	}

	public printInfo() {
		System.out.println("Brand: "+brand);

		System.out.println("Model: "+model);

		System.out.println("Year: "+year);

		System.out.println("Rental price: "+rentalPrice);
	}
}

public class Car extends Vehicle {
	Integer numberOfSeats;
	public Car(brand, model, year, rentalPrice) {
		super(brand, model, year, rentalPrice);
	}
	public getNumberOfSeats() {
		return numberOfSeats;
	}
}


public class Motorcycle extends Vehicle {
	String engineCapacity;
	public Motorcycle(brand, model, year, rentalPrice) {
		super(brand, model, year, rentalPrice);
	}
	public getEngineCapacity() {
		return engineCapacity;
	}
}

public class Main {
	public static void main() {
		Vehicle car = new Car("b","m",2023, 10);
		Vehicle motorcycle = new Motorcycle("b","m",2023, 10);

		car.printInfo();
		motorcycle.printInfo();
	}
}