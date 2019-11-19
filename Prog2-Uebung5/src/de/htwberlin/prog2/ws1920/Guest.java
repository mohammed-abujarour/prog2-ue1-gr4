package de.htwberlin.prog2.ws1920;

import java.util.Date;

import de.htwberlin.prog2.ws1920.extern.Wallet;

public class Guest {

	private String firstName;
	private String lastName;
	private Gender gender;
	private Date birthDate;
	private Address privateAdresse;
	private Address businessAdresse;
	private Wallet<IBuchbar> bookingHistory;
	private Wallet<Payment> paymentHistory;
	private long id;
	private static long counter = 100;
	private long points;
	
	public Guest(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = counter++;
		bookingHistory = new Wallet<>();
		paymentHistory = new Wallet<>();
		
	}

	public void setPrivateAdresse(Address privateAdresse) {
		this.privateAdresse = privateAdresse;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the bookingHistory
	 */
	public Wallet<IBuchbar> getBookingHistory() {
		return bookingHistory;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	public long getPoints() {
		return this.points;
	}
	
	
	public void addPoints(long newPoints) {
		this.points += newPoints;				
	}
	public String toString() {
		return "Guest [name=" + firstName + " " + lastName + ", privateAdresse=" + privateAdresse + ", businessAdresse="
				+ businessAdresse + "]";
	}

}
