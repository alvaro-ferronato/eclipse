package br.com.car;

public class Car {
	
	private String brand;
	private String model;
	private int yearModel;
	private int speed;
	
	//Constructor accepts and initializes the car with data
	public Car(String brand, String model, int yearModel) {
		this.brand = brand;
		this.model = model;
		this.yearModel = yearModel;
		this.speed = 0;
	}

	
	//Getters
	
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}	
	
	public int getYearModel() {
		return yearModel;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	//Setters
	
	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	
	
	
	//Actions
	
	public void accelerate() {
		this.speed = this.speed + 5;
	}
	
	public void brake () {
		this.speed = this.speed - 5;
	}
	
	
	
}
