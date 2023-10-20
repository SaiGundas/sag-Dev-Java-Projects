package classRegistration;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student (1, 29 , "Sai", "Gunda", 3.25 );
		Student s2 = new Student (2, 22 , "Pradeep", "K", 3.45 );
		Student s3 = new Student (3 ,23 , "Jaya", "Pradha", 3.36 );
		Student s4 = new Student (4, 21 , "Robert", "Ron", 3.44 );
		Student s5 = new Student (5 ,24 , "Adam",  "Alex", 3.74 );
		Student s6 = new Student (6 ,32 , "Steve", "Reed", 3.64 );
		Student s7 = new Student (7, 29 , "Raid",  "Ted", 3.54 );
		
		System.out.println("s1 or s2? : "+ s1.compareTo(s2));// s1 < s2
		System.out.println("s1 or s4? : "+ s1.compareTo(s3));//s1 < s4
		System.out.println("s1 or s5? : "+ s1.compareTo(s5));//s1< s5 
		// since the comparable between firstnumber and nextNumber is less	
		//jvm throws the -negative numbers- 
		System.out.println("s5 or s1? : "+ s5.compareTo(s1));//s5> s1 //Here it's opposite.
		
	}
				//
					

}
