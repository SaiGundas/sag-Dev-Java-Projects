package classRegistration;

public class Student implements Comparable<Student> {
	// not just a regular interface comparable,
	// its an interface which takes the type Student.
	// ****//if i implement any interface class, i must override all of it's
	// functions//****

	// variables of Student
	private int id;
	private int age;
	private String FirstName;
	private String LastName;
	private double gpa;

	//Empty Constructor compulsory//**
	public Student() {
		
	}

	//Constructor
	public Student(int id, int age, String firstName, String lastName, double gpa) {
		super();
		this.id = id;
		this.age = age;
		FirstName = firstName;
		LastName = lastName;
		this.gpa = gpa;
	}
//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	//To String Constructor// 
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", FirstName=" + FirstName + ", LastName=" + LastName + ", gpa="
				+ gpa + "]";
	}
	//How can I say one student comes before another student
	public int compareTo(Student S){
		if (this.id > S.getId()) {
			return 1;
		}
		else if(this.id < S.getId()) {
			return -1;
	}else if (this.id == S.getId()) {
		
		}return 0;
	}
}

