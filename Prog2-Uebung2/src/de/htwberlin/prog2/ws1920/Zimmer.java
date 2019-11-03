package de.htwberlin.prog2.ws1920;

public abstract class Zimmer {

	private String number;
	private double price;
	private int capacity;
	private boolean bookings [] = new boolean [365]; // Tage des Jahres
	
	public Zimmer(String number) {
			this.number = number;
			
	}
	
	

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean book(int day) {
		
		if(bookings[day] == true) {
			return false;
		}
		else {
			bookings[day] = true;
			return true;
		}
	}


	@Override
	public String toString() {
		return "Zimmer [number=" + number + ", price=" + price + ", capacity=" + capacity + "]";
	}
	
	
	
	
}
