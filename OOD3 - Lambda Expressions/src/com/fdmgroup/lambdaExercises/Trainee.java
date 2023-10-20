package com.fdmgroup.lambdaExercises;

public class Trainee {

	private String firstName;
	private String lastName;
	private int marks;
	private String Streams;


	public Trainee() {
		super();
	}

	public Trainee(String firstName, String lastName, int marks, String streams) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
		Streams = streams;
	}

	public Trainee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Trainee(String firstName, String lastName, int marks) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getStreams() {
		return Streams;
	}

	public void setStreams(String streams) {
		Streams = streams;
	}

}
