package com.fdmgroup.lambdaExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Runner {
	public static void main(String[] args) {
	
		BankAccount account1 = new BankAccount(12345678, 987654, "Mr J Smith", "savings", 1.1, 25362.91);
		BankAccount account2 = new BankAccount(87654321, 234567, "Ms J Jones"	,"current/checking",	0.2, 550);
		BankAccount account3= new BankAccount(74639572, 946284,"Dr T Williams", "savings", 	1.1	, 4763.32);
		BankAccount account4 = new BankAccount(94715453, 987654, "Ms S Taylor" , "savings" , 	1.1, 	10598.01);
		BankAccount account5= new BankAccount(16254385, 234567, "Mr P Brown" , "current/checking" , 0.2 , -195.74);
		BankAccount account6= new BankAccount(38776543, 946284, "Ms F Davies" , "current/checking" , 0.2 ,  -503.47);
		BankAccount account7= new BankAccount(87609802, 987654,	 "Mr B Wilson", "savings" , 1.1 , 2.5);
		BankAccount account8= new BankAccount(56483769, 234567, "Dr E Evans", "current/checking" , 0.2 ,-947.72);
		
		List<BankAccount> accounts = new ArrayList<BankAccount>();
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		accounts.add(account4);
		accounts.add(account5);
		accounts.add(account6);
		accounts.add(account7);
		accounts.add(account8);
		
	//1.2 1.2	Writing lambdas to implement functional interfaces.
		Function<BankAccount, String> getCustomerNameAndBalance = BankAccount -> BankAccount.getAccountHolder() + " " + BankAccount.getBalance();
		String BankAccountfor3 = getCustomerNameAndBalance.apply(account3);
		String BankAccountfor4 = getCustomerNameAndBalance.apply(account4);
		System.out.println(BankAccountfor3);
		System.out.println(BankAccountfor4);
	
		 //Returns 1.1
		Function<BankAccount, Double> getAmountOfInterest = BankAccount -> BankAccount.getInterestRate();
		double calculatedInterestRateFor2 = getAmountOfInterest.apply(account2);
		System.out.println(calculatedInterestRateFor2);
		
		//Returns 1.1 and Returns 0.0
		Function<BankAccount, Double> overDrawn = BankAccount -> BankAccount.getBalance() < 0 ? 0 : BankAccount.getInterestRate();
		double findInterest1 = overDrawn.apply(account2);
		double findInterest2 = overDrawn.apply(account8);
		System.out.println(findInterest1);
		System.out.println(findInterest2);
		
	
	//Predicate
	Predicate<BankAccount> checkAccType = acc -> acc.getAccountType() == "current/checking";
	boolean accType = checkAccType.test(account2);
	System.out.println(accType);
	
	
	Predicate<BankAccount> ifOverDrawn = overdrawn -> overdrawn.getAccountNumber() < 0;
	boolean accountOverDrawn = ifOverDrawn.test(account1);
	System.out.println(accountOverDrawn);

	
	//Binary Operator
	BinaryOperator<BankAccount> getHighBalance = (acc3, acc4) -> account3.getBalance() > account4.getBalance() ? account3 : account4;
	BankAccount checkHighBalanceinAccount = getHighBalance.apply(account3, account4);
	System.out.println(checkHighBalanceinAccount);
	
	//Consumer Interface
	Consumer<BankAccount> printBalanceAfterDeduction = customAcc -> System.out.println(customAcc.getBalance()-10);
	printBalanceAfterDeduction.accept(account2);
	printBalanceAfterDeduction.accept(account6);
	
	//BiConsumer Interface
	BiConsumer<BankAccount, Integer> deducting=
            (acc1,x)->System.out.println(acc1.getBalance()-x);
            deducting.accept(account1, 100);
            deducting.accept(account5, 50);
            
      //1.3.2 Writing lambdas from List Methods.      
           accounts.forEach(acc -> System.out.println(acc.getAccountNumber()+ " "+acc.getAccountHolder()+" "+acc.getAccountType()+" "+acc.getBalance()));
           
            
     //1.3.3
           accounts.forEach(acc ->System.out.println(acc.getBalance()-10));
           
     //1.3.4
           //accounts.removeIf(ifOverDrawn)
           
    //1.3.5        
            
   
           
    //1.4.1 Writing Lambdas for Comparators
          Comparator<BankAccount> compare = (acc1, acc2) -> Double.compare(acc1.getBalance(), acc2.getBalance());
          Collections.sort(accounts, compare);
          accounts.forEach( customAccount ->{
        	System.out.println("Sorted List of Balance:" + customAccount);
          });
           
          System.out.println();
          
        //1.4.3 
          Comparator<BankAccount> compareAccNumbers = (accNumber1, accNumber2) -> Double.compare(accNumber1.getAccountNumber(), accNumber2.getAccountNumber());
          Collections.sort(accounts, compareAccNumbers);
          accounts.forEach(custAccount ->{
        	  System.out.println(" Sorted List of Account Number: " +  custAccount);
        	  
          });
        
         //1.4.4
        
           
           
	
}
}