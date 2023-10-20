package com.fdmgroup.lambdaExercises;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Trainee, String> getFullName = trainee -> trainee.getFirstName( ) + "  " + trainee.getLastName();
		Trainee trainee1 = new Trainee("Sai Abhishek" ,"Gunda", 85, "Java");
		String fullName= getFullName.apply(trainee1);
		System.out.println(fullName);
		
		//BiFunction
		BiFunction<Trainee, Integer , String> getTraineeNamewithTitle = (trainee, marks) -> marks +" " + 
		trainee.getFirstName() + " " + trainee.getLastName();
		Trainee trainee2 = new Trainee( "Dennis", "Rock", 75,"Javascript");
		String fullNameWithTitle = getTraineeNamewithTitle.apply(trainee2, 75);
		System.out.println(fullNameWithTitle);
		
		
	}

}
