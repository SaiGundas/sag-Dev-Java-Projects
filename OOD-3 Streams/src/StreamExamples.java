

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		
		List<Trainee> traineesInClass = new ArrayList<Trainee>();
		
		traineesInClass.add(new Trainee("Abhishek","Sai","Java", 3, 29, 3.0));
		traineesInClass.add(new Trainee("Mark","Anthony","BA",3, 28, 3.1));
		traineesInClass.add(new Trainee("Reed","Cage","Angular",3, 29, 3.2));
		traineesInClass.add(new Trainee("Sandra","Barrens",".net",3,32,3.5));
		traineesInClass.add(new Trainee("Jaya","Preet","Java",3,30,3.4));
		traineesInClass.add(new Trainee("Pradeep","Nk","Java",3,26,3.3));
		
		//filtering Streams
		//System.out.println(traineesInClass.stream().filter(trainee -> trainee.getStream().equals("BA")));
		
		//To count the number of Trainees that are registered in BA stream.
		long numberofBAtrainees = traineesInClass.stream().filter(t -> t.getStream().equals("Java")).count();
		//System.out.println(numberofBAtrainees);
		
		// Creating a collection of stream.
		List<Trainee> javaTrainees = traineesInClass.stream().filter(t -> t.getStream().equals("Java"))
																						.collect(Collectors.toList());
		System.out.println(javaTrainees);

	}

}
