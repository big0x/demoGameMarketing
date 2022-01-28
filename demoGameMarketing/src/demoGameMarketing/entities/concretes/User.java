package demoGameMarketing.entities.concretes;

import java.time.LocalDate;
import java.util.ArrayList;

import demoGameMarketing.entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String username;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String identityNumber;
	
	public User() {
		super();
	}
	public User(int id, String username, String firstName, String lastName, LocalDate dateOfBirth,
			String identityNumber) {
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.identityNumber = identityNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public ArrayList<Game> getGames() {
		return games;
	}
	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
	private ArrayList<Game> games;
}
