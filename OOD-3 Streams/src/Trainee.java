
public class Trainee {
	 private String firstName;
	 private String lastName;
	 private String Stream;
	 private int week;
	 private int age;
	 private double averageGrade;
	 
	public Trainee(String firstName, String lastName, String stream, int week, int age, double averageGrade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.Stream = stream;
		this.week = week;
		this.age = age;
		this.averageGrade = averageGrade;
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
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getAverageGrade() {
		return averageGrade;
	}
	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}
	
	@Override
	public String toString() {
		return "Trainee [firstName=" + firstName + ", lastName=" + lastName + ", Stream=" + Stream + ", week=" + week
				+ ", age=" + age + ", averageGrade=" + averageGrade + "]";
	}
	
	
	 
}
