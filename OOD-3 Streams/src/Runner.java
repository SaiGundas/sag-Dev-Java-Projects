import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
public static void main(String[] args) {
	List<Person> virtualClass = new ArrayList<>();
	
		virtualClass.add(new Person("Abhishek", 29, Person.Sex.MALE, "ask.abhi@gmail.com"));
		virtualClass.add(new Person("Pradeep", 26, Person.Sex.MALE, "ask.Pradeep@gmail.com"));
		virtualClass.add(new Person("Jaya", 30, Person.Sex.FEMALE, "ask.Jaya@gmail.com"));
		virtualClass.add(new Person("Rebecca", 25, Person.Sex.FEMALE, "ask.Rebecca@gmail.com"));
		virtualClass.add(new Person("Martin", 29, Person.Sex.MALE, "ask.Martin@gmail.com"));
		virtualClass.add(new Person("Rachel", 29, Person.Sex.FEMALE, "ask.Rachel@gmail.com"));
		
		//How to Convert collection to a String
		//A by using .Stream
		
		System.out.println(virtualClass.stream().filter(p -> p.getAge()>20).count());
		
		List<Person>femaleList = virtualClass.stream().filter(p ->p.getGender().equals(Person.Sex.FEMALE))
				.collect(Collectors.toList());
		
}
}
