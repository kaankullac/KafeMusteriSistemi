package javaodev3.entities;
import java.time.LocalDate;

import javaodev3.abtracts.Entities;

public class Customer implements Entities{
	
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalitId;
	
	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalitId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalitId = nationalitId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalitId() {
		return nationalitId;
	}

	public void setNationalitId(String nationalitId) {
		this.nationalitId = nationalitId;
	}
	
	

}
